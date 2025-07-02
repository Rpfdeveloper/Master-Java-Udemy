import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String name;
        double price = 0;
        double priceIVA;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre o descripción de la factura");
        name = sc.nextLine();
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduzca el precio número " + (i + 1));
            price += sc.nextDouble();
        }
        priceIVA = price + (price * 0.19);
        System.out.println("Nombre de factura: " + name + "\n" +
                "Precio sin IVA: " + String.format("%.2f", price) + "\n" +
                "Precio con IVA: " + String.format("%.2f", priceIVA));
    }
}
