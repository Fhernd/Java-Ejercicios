package ejercicio0000249;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Cliente {

    public static void main(String[] args) throws IOException, 
            ClassNotFoundException {
        
        final int PUERTO = 20064;
        
        Socket socket = new Socket("localhost", PUERTO);
        
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        
        Date fecha = (Date) ois.readObject();
        
        System.out.println(fecha.toString());
    }
}
