import java.util.Scanner;

public class NumeroMenorDeMultiplesValores {
    public static void main(String[] args) {

        int numMenor;
        int cantidad;

        Scanner sc = new Scanner(System.in);
        //Requisito cantidad > 10
        do {
            System.out.println("Introduzca una cantidad de números a comparar mayor que 10");
            cantidad = sc.nextInt();
        } while (cantidad < 10);

        int[] nums = new int[cantidad];

        //cargamos valores en array tipo int primitivo
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduzca el valor número " + (i + 1));
            nums[i] = sc.nextInt();
        }
        //Inicializamos con el primer valor contenido en el array
        numMenor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < numMenor) {
                numMenor = nums[i];
            }
        }
        System.out.println("El menor número introducido es : " + numMenor);
    }
}
