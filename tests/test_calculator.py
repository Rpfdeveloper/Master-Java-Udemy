"""Execute the actual Java CLI, including invalid input and arithmetic boundaries."""
import os
from pathlib import Path
import shutil
import subprocess
import tempfile
import unittest

ROOT = Path(__file__).resolve().parents[1]
CLASS = 'ArgumentosLineaDeComandoCalculadora'


class CalculatorTests(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.java = os.environ.get('JAVA') or shutil.which('java')
        if not cls.java:
            raise RuntimeError('JDK 17 required: put java on PATH or set JAVA.')
        cls.temp = tempfile.TemporaryDirectory()
        cls.addClassCleanup(cls.temp.cleanup)
        subprocess.run([cls.java, '-m', 'jdk.compiler/com.sun.tools.javac.Main',
                        '-encoding', 'UTF-8', '-d', cls.temp.name,
                        str(ROOT / 'src' / f'{CLASS}.java')], check=True,
                       capture_output=True, text=True, timeout=30)

    def run_cli(self, *args):
        return subprocess.run([self.java, '-cp', self.temp.name, CLASS, *args],
                              text=True, capture_output=True, timeout=10)

    def test_arithmetic(self):
        for args, expected in [
            (('suma', '2', '3'), 5.0), (('resta', '2', '3'), -1.0),
            (('multi', '6', '7'), 42.0), (('multiplicación', '6', '7'), 42.0),
            (('div', '7', '2'), 3.5), (('multi', '-2', '3'), -6.0),
            (('suma', '2147483647', '1'), 2147483648.0),
            (('multi', '50000', '50000'), 2500000000.0),
            (('resta', '-2147483648', '1'), -2147483649.0),
        ]:
            with self.subTest(args=args):
                result = self.run_cli(*args)
                self.assertEqual(result.returncode, 0, result.stderr)
                self.assertEqual(float(result.stdout.rsplit(':', 1)[1]), expected)

    def test_argument_count(self):
        for args in [(), ('suma',), ('suma', '2'), ('suma', '2', '3', '4')]:
            with self.subTest(args=args):
                result = self.run_cli(*args)
                self.assertEqual(result.returncode, 2)
                self.assertIn('Uso:', result.stderr)
                self.assertNotIn('Exception', result.stderr)

    def test_invalid_numbers(self):
        for value in ['abc', '1.5', '2147483648']:
            with self.subTest(value=value):
                result = self.run_cli('suma', value, '2')
                self.assertEqual(result.returncode, 2)
                self.assertNotIn('El resultado', result.stdout)

    def test_unknown_operation_does_not_silently_add(self):
        result = self.run_cli('unknown', '2', '3')
        self.assertEqual(result.returncode, 2)
        self.assertIn('Operación desconocida', result.stderr)
        self.assertNotIn('El resultado', result.stdout)

    def test_zero_divisor(self):
        result = self.run_cli('div', '5', '0')
        self.assertEqual(result.returncode, 2)
        self.assertIn('cero', result.stderr)


if __name__ == '__main__':
    unittest.main()
