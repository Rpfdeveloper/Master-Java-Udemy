import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {

        String[] nombres = {"Roberto", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;

        for (int i = 0; i < count; i++) {

            if (nombres[i].toLowerCase().contains("ROBERTO".toLowerCase()) || nombres[i].toLowerCase().contains("PePa".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema");
        }
    }
}
