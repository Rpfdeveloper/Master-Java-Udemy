import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de entorno de sistema = " + varEnv);

        System.out.println("------ Listando variables de entorno del sistema -----");

        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));

        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("Path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("Path2 = " + path2);

        //Antes creamos la variable de entorno siguiente mediante la interface gráfica de windows.
        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        //en terminal con el comando setx SALUDAR_HOLA Hola amigos que tal creamos esta variable de entorno con su valor.

        //Aqui realizamos un get para verlo en consola imprimiendo la variable hola con la asignación previa.
        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("appEnv = " + hola);
    }
}