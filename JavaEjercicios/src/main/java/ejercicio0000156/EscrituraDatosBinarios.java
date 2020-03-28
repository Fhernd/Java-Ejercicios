package ejercicio0000156;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Ejercicio 156: Escribir archivos con datos binarios.
 * 
 * @author John Ortiz Ordoñez
 */
public class EscrituraDatosBinarios {
    
    public static void main(String[] args) {
        
        int edad = 19;
        double precio = 389.3;
        String nombre = "Edward Ortiz";
        
        String nombreArchivo = "datos_binarios.dat";
        
        try{
            
            OutputStream os = new FileOutputStream(nombreArchivo);
            DataOutputStream dos = new DataOutputStream(os);
            
            // Escritura de datos:
            dos.writeInt(edad);
            dos.writeDouble(precio);
            dos.writeUTF(nombre);
            
            System.out.println("Escritura finalizada.");
            
            dos.close();
        } catch(IOException e){
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
