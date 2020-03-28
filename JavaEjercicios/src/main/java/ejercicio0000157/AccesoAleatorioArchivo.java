package ejercicio0000157;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Ejercicio 157: Acceder de forma aleatoria el contenido de un archivo.
 * 
 * @author John Ortiz Ordoñez
 */
public class AccesoAleatorioArchivo {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "nombres.txt";
        
        try {
            RandomAccessFile raf = new RandomAccessFile(NOMBRE_ARCHIVO, "rw");
            
            raf.writeUTF("Java es tremendo! La versión más reciente es la 12.");
            
            raf.seek(0);
            
            System.out.println("Contenido: " + raf.readUTF());
            
            // Cambio de posición en el archivo:
            raf.seek(10);
            byte[] bytes = new byte[30];
            
            raf.read(bytes);
            
            System.out.println("Contenido: " + new String(bytes));
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
