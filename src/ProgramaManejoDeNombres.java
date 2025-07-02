import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String integrante1;
        String integrante2;
        String integrante3;
        String concat1;
        String concat2;
        String concat3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Porfavor introduzca al integrante numero 1 de su familia");
        integrante1 = sc.nextLine();
        System.out.println("Porfavor introduzca al integrante numero 2 de su familia");
        integrante2 = sc.nextLine();
        System.out.println("Porfavor introduzca al integrante numero 3 de su familia");
        integrante3 = sc.nextLine();

        concat1 = integrante1.substring(1, 2).toUpperCase().concat(".").concat("es");
        concat2 = integrante2.substring(1, 2).toUpperCase().concat(".").concat("es");
        concat3 = integrante3.substring(1, 2).toUpperCase().concat(".").concat("es");

        System.out.println(concat1 + "_" + concat2 + "_" + concat3);

    }
}
