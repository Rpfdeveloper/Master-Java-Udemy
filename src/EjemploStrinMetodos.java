import java.sql.SQLOutput;

public class EjemploStrinMetodos {
    public static void main(String[] args) {
        String nombre = "Julio";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Julio\") = " + nombre.equals("Julio"));
        System.out.println("nombre.equals(\"julio\") = " + nombre.equals("julio"));
        System.out.println("nombre.equalsIgnoreCase(\"julio\") = " + nombre.equalsIgnoreCase("julio"));
        System.out.println("nombre.compareTo(\"Julio\") = " + nombre.compareTo("Julio"));
        System.out.println("nombre.compareTo(\"Julio\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\" ) = " + trabalenguas.replace("a","." ));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"l\") = " + trabalenguas.endsWith("l"));
        System.out.println(" trabalenguas ".trim());
    }
}
