import java.net.StandardSocketOptions;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String ... que tal!";

        Integer num = 7;

        Boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es de tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es de tipo Object = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es de tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es de tipo Object = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);






    }
}
