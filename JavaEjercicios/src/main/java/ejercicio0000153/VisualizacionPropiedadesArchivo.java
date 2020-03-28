package ejercicio0000153;

import java.io.File;

/**
 * Ejercicio 153: Obtener propiedades de un archivo.
 * 
 * @author John Ortiz Ordoñez
 */
public class VisualizacionPropiedadesArchivo {

    public static void main(String[] args) {
        
        String ruta = VisualizacionPropiedadesArchivo.class
                .getResource("lenguajes.txt").getPath();
        
        File archivo = new File(ruta);
        
        System.out.println("¿El archivo existe?: " + 
                archivo.exists());
        
        System.out.println("\n¿Es un archivo?: " + archivo.isFile());
        
        System.out.println("\n¿Es una carpeta?: " + archivo.isDirectory());
        
        System.out.println("\n¿Es de ejecución?: " + archivo.canExecute());
        
        System.out.println("\n¿Es de lectura?: " + archivo.canRead());
        
        System.out.println("\n¿Es de escritura?: " + archivo.canWrite());
        
        System.out.println("\nNombre del archivo: " + archivo.getName());
        
        System.out.println("\nCarpeta padre: " + archivo.getParent());
        
        System.out.println("\nEspacio total: " + archivo.getTotalSpace());
        
        System.out.println("\nEspacio usable: " + archivo.getUsableSpace());
    }
}
