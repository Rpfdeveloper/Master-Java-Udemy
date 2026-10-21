# Fundamentos de Java · Ejercicios de formación

[![Java examples](https://github.com/Rpfdeveloper/Master-Java-Udemy/actions/workflows/java-examples.yml/badge.svg?branch=main)](https://github.com/Rpfdeveloper/Master-Java-Udemy/actions/workflows/java-examples.yml)

**Java · Consola · Control de flujo · Strings · Fechas · Validación de entradas**

Colección de **58 archivos Java** realizados durante mi formación con un curso de Udemy. Este repositorio documenta mi práctica de los fundamentos del lenguaje; los ejercicios están vinculados al curso y no se presentan como aplicaciones profesionales originales.

**English:** Java fundamentals coursework: small standalone console exercises, plus a command-line calculator with regression tests for input validation and arithmetic.

## Recorrido recomendado

| Área | Ejemplos |
| --- | --- |
| Operadores y decisiones | [`OperadoresAritmeticos`](src/OperadoresAritmeticos.java), [`SentenciaIfElse`](src/SentenciaIfElse.java), [`SentenciaSwitchCase`](src/SentenciaSwitchCase.java) |
| Bucles y recorridos | [`SentenciaForEach`](src/SentenciaForEach.java), [`SentenciasBucleEtiquetasBuscar`](src/SentenciasBucleEtiquetasBuscar.java) |
| Texto y datos | [`ProgramaManejoDeNombres`](src/ProgramaManejoDeNombres.java), [`EjemploJavaUtilDateParse`](src/EjemploJavaUtilDateParse.java) |
| Argumentos y errores de entrada | [`ArgumentosLineaDeComandoCalculadora`](src/ArgumentosLineaDeComandoCalculadora.java) |
| Ejercicios interactivos | [`SistemaDeNotasDeAlumnos`](src/SistemaDeNotasDeAlumnos.java) |

## Ejecutar un ejemplo

Requisitos: Git y JDK 17. Cada clase tiene su propio `main`; no hay una aplicación única ni dependencias externas de ejecución.

```bash
git clone https://github.com/Rpfdeveloper/Master-Java-Udemy.git
cd Master-Java-Udemy
javac -encoding UTF-8 -d build/classes src/ArgumentosLineaDeComandoCalculadora.java
java -cp build/classes ArgumentosLineaDeComandoCalculadora suma 2 3
```

Resultado:

```text
El resultado de la operación 'suma' es: 5.0
```

La calculadora acepta `suma`, `resta`, `multi` (también `multiplicación`) y `div`, con dos enteros de 32 bits. El resultado se representa como `double`. Ante argumentos incompletos, valores inválidos, operaciones desconocidas o división por cero, informa por la salida de error y termina con código `2`.

## Compilar toda la colección

**Windows PowerShell**

```powershell
$fuentesJava = (Get-ChildItem -Path src -Filter *.java).FullName
javac -encoding UTF-8 -d build/classes $fuentesJava
```

**Linux / macOS**

```bash
javac -encoding UTF-8 -d build/classes src/*.java
```

### Ejemplo que necesita un archivo de propiedades

[`EjemploAsignarPropiedadesDeSistema`](src/EjemploAsignarPropiedadesDeSistema.java) intenta leer `src/config2.properties`, que no está incluido en el repositorio. Para ejecutarlo con los datos de ejemplo de [`src/config.properties`](src/config.properties), prepara una copia desde la raíz del proyecto:

| Entorno | Comando |
| --- | --- |
| Windows PowerShell | `Copy-Item -Path src/config.properties -Destination src/config2.properties` |
| Linux / macOS | `cp src/config.properties src/config2.properties` |

Después de compilar la colección, ejecuta desde esa misma raíz:

```bash
java -cp build/classes EjemploAsignarPropiedadesDeSistema
```

Sin ese archivo, el ejemplo captura `FileNotFoundException`, muestra el error y termina con código `1`. Con la copia del archivo de ejemplo se ha comprobado la ejecución con Java 17. Los demás ejercicios pueden requerir entrada interactiva o herramientas del sistema operativo; la compilación de la colección no acredita su funcionamiento completo.

## Pruebas de la calculadora

Requieren Python 3 y un JDK 17 disponible en `PATH`:

```bash
python3 -m unittest discover -s tests -v
```

En Windows también se puede usar `py -3 -m unittest discover -s tests -v`. Las pruebas compilan y ejecutan la clase real en un directorio temporal.

Se comprueban cuatro operaciones, el alias de multiplicación, números negativos, límites aritméticos, argumentos ausentes o sobrantes, números inválidos, operaciones desconocidas y división por cero.

**Validación realizada:** los 58 archivos compilan con Java 17 y pasan las cinco pruebas de regresión, con 18 casos de entrada. La compilación muestra avisos de operaciones genéricas sin comprobar en un ejercicio del curso; no se ha certificado el comportamiento de todos los ejemplos.

## Comprobación automática

El workflow [Java examples](https://github.com/Rpfdeveloper/Master-Java-Udemy/actions) está configurado para compilar toda la colección y ejecutar las cinco pruebas de la calculadora en cada push y pull request con JDK 17 y Python 3. Las pruebas ejecutan la clase real; las restantes clases se comprueban por compilación, sin afirmar su validación funcional.

## Contexto y autoría

Repositorio de formación de [Roberto Pajuelo · Rpfdeveloper](https://github.com/Rpfdeveloper). Los ejemplos se basan en el curso; la mejora posterior de la calculadora y sus pruebas están identificadas en el historial de cambios. Esta revisión se ha realizado con asistencia de IA.
