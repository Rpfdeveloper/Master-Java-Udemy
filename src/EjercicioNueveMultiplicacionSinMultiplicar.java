import java.util.Scanner;

public class EjercicioNueveMultiplicacionSinMultiplicar {
    public static void main(String[] args) {

        int primerFactor;
        int segundoFactor;
        int producto = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a multiplicar numeros enteros! ");
        System.out.println("Introduzca el primer factor: ");
        primerFactor = sc.nextInt();
        System.out.println("Introduzca el segundo factor");
        segundoFactor = sc.nextInt();

        if (primerFactor == 0 || segundoFactor == 0) {
            System.out.println("El producto es = " + producto);
            return;
        }
        //Comprobamos el signo del resultado
        boolean esPositivo = ((primerFactor > 0 && segundoFactor > 0) || (primerFactor < 0 && segundoFactor < 0));

        //convertimos todos a positivos.
        int primerFactorPos = primerFactor < 0 ? -primerFactor : primerFactor;
        int segundoFactorPos = segundoFactor < 0 ? -segundoFactor : segundoFactor;

        //Iteramos las veces del valor del segundo factor.
        for (int i = 0; i < segundoFactorPos; i++) {
            producto += primerFactorPos;
        }

        //cambiamos signo.
        if (!esPositivo) {
            producto = -producto;
        }
        System.out.println("El producto de la multiplicacion es " + producto);
    }
}