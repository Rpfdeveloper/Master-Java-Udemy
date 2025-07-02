import java.util.Scanner;

public class EjercicioCincoEstanqueDeGasolina {
    public static void main(String[] args) {

        double capacity;
        String result = "";
        //Practicando arreglos
        int[] medidas = {70, 60, 40, 35, 20, 1};
        String[] text = {"Estanque lleno", "Estanque casi lleno", "Estanque  3/4", "Medio Estanque ", "Suficiente", "Insuficiente"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la capacidad actual en litros con decimales del estanque de gasolina. Recuerda usar la coma!");
        capacity = sc.nextDouble();

        if (capacity == medidas[0]) {
            result = text[0];
        } else if (capacity < medidas[0] && capacity >= medidas[1]) {
            result = text[1];
        } else if (capacity < medidas[1] && capacity >= medidas[2]) {
            result = text[2];
        } else if (capacity < medidas[2] && capacity >= medidas[3]) {
            result = text[3];
        } else if (capacity < medidas[3] && capacity >= medidas[4]) {
            result = text[4];
        } else if (capacity < medidas[4] && capacity >= medidas[5]) {
            result = text[5];
        } else {

            System.out.println("Porfavor, introduzca una capacidad coerente con la del depósito");
        }
        //si el resultado difiere de texto vacio se imprime el resultado
        if (!result.equals("")) {
            System.out.println("Capacidad = " + result);
        }
    }
}
