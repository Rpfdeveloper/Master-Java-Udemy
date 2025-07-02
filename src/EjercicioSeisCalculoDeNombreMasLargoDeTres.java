import javax.swing.*;

public class EjercicioSeisCalculoDeNombreMasLargoDeTres {
    public static void main(String[] args) {

        String person1 = JOptionPane.showInputDialog("Introduzca el primer nombre y apellido ");
        String person2 = JOptionPane.showInputDialog("Introduzca el segundo nombre y apellido ");
        String person3 = JOptionPane.showInputDialog("Introduzca el tercer nombre y apellido ");

        //indicamos el indice del arreglo devuelto por el metodo split de la clase String

        String name1 = person1.split(" ")[0];
        String name2 = person2.split(" ")[0];
        String name3 = person3.split(" ")[0];


        String maxLengthName;

        if (name1.length() >= name2.length() && name1.length() >= name3.length()) {

            maxLengthName = name1;

        } else if (name2.length() >= name1.length() && name2.length() >= name3.length()) {

            maxLengthName = name2;
        }else {

            maxLengthName = name3;
        }

        JOptionPane.showMessageDialog(null,"El nombre más largo es: " + maxLengthName);
    }
}