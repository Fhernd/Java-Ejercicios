package ejercicio0000161;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Ejercicio 160: Comprimir archivos usando el formato ZIP.
 * 
 * @author John Ortiz Ordoñez
 */
public class CompresionArchivos {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "lenguajes.txt";
        final String NOMBRE_ARCHIVO_ZIP = "archivos.zip";
        
        try {
            FileOutputStream fos = new FileOutputStream(NOMBRE_ARCHIVO_ZIP);
            ZipOutputStream zos = new ZipOutputStream(fos);
            
            File archivoLenguajes = new File(NOMBRE_ARCHIVO);
            FileInputStream fis = new FileInputStream(archivoLenguajes);
            
            ZipEntry ze = new ZipEntry(archivoLenguajes.getName());
            zos.putNextEntry(ze);
            
            byte[] bytes = new byte[1024];
            int longitud;
            
            while((longitud = fis.read(bytes)) >= 0){
                zos.write(bytes, 0, longitud);
            }
            
            zos.close();
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
