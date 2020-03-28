package ejercicio0000023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class LecturaDatosUsuario {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre = "";
        
        try {
            System.out.print("Digite su nombre: ");
            nombre = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(LecturaDatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Bienvenido, " + nombre);
    }
}
