import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjercicioOnceCalcularEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedimos una fecha en String
        System.out.println("Ingrese su fecha de nacimiento con formato 'dd-MM-yyyy' :");
        String fechaTexto = sc.nextLine();

        //Creamos un formato
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            //Parseamos a tipo Date
            Date fechaDeNacimiento = formato.parse(fechaTexto);

            //Fecha actual
            Calendar hoy = Calendar.getInstance();

            //Creamos un calendario y seteamos la fecha de nacimiento
            Calendar nacimiento = Calendar.getInstance();
            nacimiento.setTime(fechaDeNacimiento);

            //Cálculo de los años
            int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

            //Evitamos errores por dia y mes de nacimiento
            if(hoy.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH) ||
                    (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) &&
                            hoy.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))){
                edad--;
            }

            System.out.println("tú edad es " + edad + " años");

        } catch (ParseException e) {
            System.out.println("La fecha ingresada no es válida. Usa el formato dd/MM/yyyy");
        }

    }
}
