package ejercicio0000250;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 * Ejercicio 250: Establecer conexión a un servidor FTP usando Apache Commons Net.
 *
 * @author John Ortiz Ordoñez
 */
public class ConexionServidorFTP {

    public static void main(String[] args) {
        
        final String SERVIDOR = "demo.wftpserver.com";
        final int PUERTO = 21;
        final String USUARIO = "demo-user";
        final String PASSWORD = "demo-user";
        
        FTPClient clienteFtp = new FTPClient();
        
        try {
            clienteFtp.connect(SERVIDOR, PUERTO);
            
            int respuesta = clienteFtp.getReplyCode();
            
            if (!FTPReply.isPositiveCompletion(respuesta)){
                System.out.println("Algo ha salido mal. El servidor respondió con el código: " + respuesta);
            }
            
            boolean loginSatisfactorio = clienteFtp.login(USUARIO, PASSWORD);
            
            if (loginSatisfactorio){
                System.out.println("Se ha iniciado sesión en el servidor FTP.");
            } else {
                System.out.println("Las credenciales son inválidas.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
