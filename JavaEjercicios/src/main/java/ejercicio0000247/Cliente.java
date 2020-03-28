package ejercicio0000247;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Cliente {

    public static void main(String[] args) throws IOException {
        
        try(Socket socket = new Socket("localhost", 20064)){
            System.out.println("Ingrese texto y para finalizar presione Ctrl + D o Ctrl + C: ");
            Scanner lector = new Scanner(System.in);
            Scanner entrada = new Scanner(socket.getInputStream());
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            
            while(lector.hasNextLine()){
                pw.println(lector.nextLine());
                
                System.out.println(entrada.nextLine());
            }
        }
    }
}
