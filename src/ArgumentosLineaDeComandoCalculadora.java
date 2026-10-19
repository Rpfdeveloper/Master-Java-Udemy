public class ArgumentosLineaDeComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Uso: ArgumentosLineaDeComandoCalculadora <suma|resta|multi|div> <entero> <entero>");
            System.exit(2);
            return;
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
            resultado = 0.00;
        } catch (NumberFormatException e) {
            System.err.println("Cuidado, a y b deben ser enteros, vuelva a intentar!");
            System.exit(2);
            return;
        }
        switch (operacion) {
            case "suma":
                resultado = (double) a + b;
                break;
            case "resta":
                resultado = (double) a - b;
                break;
            case "multi":
            case "multiplicación":
                resultado = (double) a * b;
                break;
            case "div":
                if (b == 0) {
                    System.err.println("No se puede dividir entre cero");
                    System.exit(2);
                    return;
                }
                resultado = (double) a / b;
                break;
            default:
                System.err.println("Operación desconocida: " + operacion);
                System.exit(2);
                return;
        }

        System.out.println("El resultado de la operación '" + operacion + "' es: " + resultado);
    }
}
