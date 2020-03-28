package ejercicio0000251;

import org.apache.commons.net.whois.WhoisClient;

/**
 * Ejercicio 251: Consultar la información de dominio con un cliente Whois de Apache Commons Net.
 *
 * @author John Ortiz Ordoñez
 */
public class InformacionDominio {

    public static void main(String[] args) throws Exception {

        final String SERVIDOR_WHOIS = "whois.markmonitor.com";
        final int PUERTO = 43;
        
        String dominio = "google.com";
        
        WhoisClient clienteWhois = new WhoisClient();
        clienteWhois.connect(SERVIDOR_WHOIS, PUERTO);
        
        String resultado = clienteWhois.query(dominio);
        
        System.out.println(resultado);
    }
}
