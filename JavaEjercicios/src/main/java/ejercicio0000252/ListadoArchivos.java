package ejercicio0000252;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

/**
 * Ejercicio 252: Listar el contenido de un directorio FTP.
 *
 * @author John Ortiz Ordoñez
 */
public class ListadoArchivos {

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
                
                FTPFile[] archivos = clienteFtp.listFiles();
                System.out.println("\nArchivos en la raíz:");
                for (FTPFile archivo : archivos) {
                    System.out.println(archivo.getName());
                }
                
                archivos = clienteFtp.listFiles("/upload");
                System.out.println("\nArchivos del directorio `upload`:");
                for (FTPFile archivo : archivos) {
                    System.out.println(archivo.getName());
                }
            } else {
                System.out.println("Las credenciales son inválidas.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
