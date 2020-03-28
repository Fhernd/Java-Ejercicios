package ejercicio0000343;

import java.io.IOException;

/**
 * Ejercicio 343: Ejecutar un programa y abrir un archivo asociado con Runtime.getRuntime().exec().
 * 
 * @author John Ortiz Ordoñez
 */
public class AperturaProgramaArchivo {
    public static void main(String[] args) {
        try {
            String[] parametros = new String[2];
            
            parametros[0] = "notepad.exe";
            parametros[1] = "D:\\java.txt"; 
            
            Process proceso = Runtime.getRuntime().exec(parametros, null);
            
            proceso.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
