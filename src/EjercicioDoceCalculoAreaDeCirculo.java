import java.util.Scanner;

public class EjercicioDoceCalculoAreaDeCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radio;
        double area;

        System.out.println("Vamos a calcular el area de un círculo cualquiera ");
        System.out.println("Introduzca el radio en cm con decimales ");
        radio = sc.nextDouble();

        area = Math.round(Math.PI * Math.pow(radio, 2) * 100.0) / 100.0;

        System.out.println("El area del circulo de radio " + radio + " es igual a " + area);
    }
}
