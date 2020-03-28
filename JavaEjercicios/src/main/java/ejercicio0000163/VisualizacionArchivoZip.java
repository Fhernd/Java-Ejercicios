package ejercicio0000163;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Ejercicio 163: Visualizar el contenido de un archivo ZIP.
 * 
 * @author John Ortiz Ordoñez
 */
public class VisualizacionArchivoZip {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "archivo_comprimido.zip";
        
        try {
            String ruta = VisualizacionArchivoZip.class.getResource(NOMBRE_ARCHIVO).getPath();
            File archivo = new File(ruta);
            
            ZipFile zip = new ZipFile(archivo);
            
            Enumeration<?> listado = zip.entries();
            ZipEntry ze;
            String nombreArchivo;
            long tamagnio;
            long tamagnioComprimido;
            
            while(listado.hasMoreElements()){
                ze = (ZipEntry) listado.nextElement();
                nombreArchivo = ze.getName();
                tamagnio = ze.getSize();
                tamagnioComprimido = ze.getCompressedSize();
                
                System.out.printf("Nombre: %s - Tamaño: %d - Tamaño comprimido: %d\n", nombreArchivo, tamagnio, tamagnioComprimido);
            }
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
