import java.util.Scanner;

public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        final int CANTIDAD_NOTAS = 20;


        String[] nombreNotas = {"Matemáticas", "Lengua", "Ciencias Naturales", "Ciencias Sociales", "Educación Física",
                "Filosofía", "Física", "Química", "Biología", "Geografía",
                "Historia", "Literatura", "Tecnología", "Informática", "Música",
                "Arte", "Economía", "Inglés", "Francés", "Valores Éticos"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a calcular distintos promedios de 20 notas");


        double sumaMayorCinco = 0.0;
        double sumnaInferiorCuatro = 0.0;
        double sumaPromedioResto = 0.0;
        int count1 = 0;
        int count4 = 0;
        int count5 = 0;
        int countRest = 0;

        for (int i = 0; i < CANTIDAD_NOTAS; i++) {

            System.out.println("Por favor introduzca la nota de la asignatura en decimales y en escala de 1 a 7 de " + nombreNotas[i]);
            double nota = sc.nextDouble();

            if (nota == 0.0) {
                System.out.println("Error, la nota no puede ser  igual a 0.0 : \n Finalizando programa");
                return;
            }

            if (nota < 1.0 || nota > 7.0) {
                System.out.println("Nota fuera de rango. Intoduzcala de nuevo dentro del rango");
                i--;
                continue;
            }
            //En esta condicion solo se cuentan las notas = 1.0
            if (nota == 1.0) {
                count1++;
            }

            if (nota < 4.0) {
                //Se suman todas las inferiores a 4.00 incluyendo las = 1.00
                sumnaInferiorCuatro += nota;
                count4++;
            } else if (nota > 5.0) {
                sumaMayorCinco += nota;
                count5++;
            } else {
                sumaPromedioResto += nota;
                countRest++;
            }


        }
        //De esta forma evitamos dividir entre cero
        double promCuatro = count4 > 0 ? sumnaInferiorCuatro / count4 : 0.0;
        double promCinco = count5 > 0 ? sumaMayorCinco / count5 : 0.0;
        double sumaTotal = sumaPromedioResto + sumaMayorCinco + sumnaInferiorCuatro;
        double cantidadNotas = count4 + count5 + countRest;
        double promTotal = cantidadNotas > 0 ? sumaTotal / cantidadNotas : 0.0;


        System.out.println("La cantidad de notas iguales que 1.0 es : " + count1 + " \n");
        System.out.println("El promedio de las notas menores que 4.0 es igual a: " + promCuatro + " \n");
        System.out.println("El promedio de las notas mayores que 5.0 es igual a: " + promCinco + " \n");
        System.out.println("El promedio total es igual a: " + promTotal + " \n");
    }
}
