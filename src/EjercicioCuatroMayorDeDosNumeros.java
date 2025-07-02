import java.util.Scanner;

public class EjercicioCuatroMayorDeDosNumeros {
    public static void main(String[] args) {

        int num;
        int num1;
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al ordenador de números!\n");

        System.out.println("Introduzca el primer número entero");
        num = sc.nextInt();

        System.out.println("Introduzca el segundo número entero");
        num1 = sc.nextInt();

        System.out.println(text = num > num1 ? "Los numeros ordenados de mayor a menor son : " + num + " y " +num1 :
                "Los numeros ordenados de mayor a menor son : " + num1 + " y " +num);

    }
}
