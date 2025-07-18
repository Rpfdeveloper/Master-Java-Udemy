class Persona{

    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public String leerNombre(){
       return this.nombre;
    }
}

public class PasarPorReferencia {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Roberto");

        System.out.println("iniciamos el método main");
        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Despues de llamar al método test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos del arreglos modificados");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
