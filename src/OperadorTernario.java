import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("Estado = " + estado);
        System.out.println("Su promedio es = " + promedio);


    }
}
