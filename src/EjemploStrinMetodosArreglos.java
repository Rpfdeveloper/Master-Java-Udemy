public class EjemploStrinMetodosArreglos {
    public static void main(String[] args) {
       
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.print("arreglo[i] = " + arreglo[i] + " ");
        }
        System.out.println();
        System.out.println("trabalenguas.spllit = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0;j < l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoarr = archivo.split("\\.");
        l = archivoarr.length;
        for (int k = 0 ; k < l; k++){
            System.out.println(archivoarr[k]);
        }
        System.out.println("extension = " + archivoarr[l-1]);
    }
}
