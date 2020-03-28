package ejercicio0000170;

import java.io.File;

/**
 * Ejercicio 170: Eliminar un archivo con el método delete de la clase 
 * File.
 * 
 * @author John Ortiz Ordoñez
 */
public class EliminacionArchivo {

    public static void main(String[] args) {
        
        final String RUTA = "D:\\Dropbox\\Pro\\Ejercicios\\Java\\EjerciciosJava\\src\\ejercicio0000170\\lenguajes.txt";
        
        try {
            File archivo = new File(RUTA);
            
            if(archivo.delete()){
                System.out.println("El archivo fue eliminado satisfactoriamente.");
            } else {
                System.out.println("No se ha podido borrar el archivo.");
            }
            
        } catch (Exception e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
