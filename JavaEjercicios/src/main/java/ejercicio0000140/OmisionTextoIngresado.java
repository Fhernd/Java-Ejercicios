package ejercicio0000140;

import java.io.Console;

/**
 * Ejercicio 140: Ingresar texto a través de la consola sin emitir los 
 * caracteres digitados.
 * 
 * @author John Ortiz Ordoñez
 */
public class OmisionTextoIngresado {
    
    public static void main(String[] args) {
        
        Console console;
        
        if((console = System.console()) != null){
            
            char[] password = null;
            
            try{
                password = console.readPassword("Contraseña:");
                
                System.out.println("Su contraseña es: " + new String(password));
            } finally {
                if (password != null){
                    java.util.Arrays.fill(password, ' ');
                }
            }
            
        } else {
            System.out.println("No existe un objeto Console.");
        }
    }
}
