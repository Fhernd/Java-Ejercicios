package ejercicio0000512;

import java.io.File;

/**
 * Ejercicio 512: Usar la clase File para obtener el tamaño en bytes de un archivo.
 *
 * @author John Ortiz Ordoñez
 */
public class TamagnioArchivo {

    public static void main(String[] args) {
        String ruta = "G:\\Dropbox\\Pro\\Ejercicios\\Java-Ejercicios\\JavaEjercicios\\src\\main\\java\\ejercicio0000512\\TamagnioArchivo.java";
        
        File archivo = new File(ruta);
        
        System.out.println("El tamaño del archivo es " + archivo.length() + " bytes");
    }
}
