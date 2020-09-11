package ejercicio0000367;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Ejercicio 367: Configurar el logging de mensajes de la aplicación sobre un
 * archivo.
 *
 * @author John Ortiz Ordoñez
 */
public class Logging {

    public static void main(String[] args) throws Exception {

        FileHandler handler = new FileHandler("src/main/resources/logs367.log", true);
        
        Logger logger = Logger.getLogger("ejercicio367");
        logger.addHandler(handler);
        
        logger.severe("Se ha producido un error grave.");
        logger.warning("Se ha producido una advertencia.");
        logger.info("El proceso ha finalizado.");
    }
}
