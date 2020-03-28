package ejercicio0000243;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Ejercicio 243: Formatear cadenas de caracteres o mensajes con la clase 
 * MessageFormat.
 * 
 * @author John Ortiz Ordoñez
 */
public class FormatoCadenas {

    public static void main(String[] args) {
        
        Date ahora = new Date();
        double valor = 987.321;
        String mensaje = "Hoy {0,date} a las {0,time} debe pagar ${1}.";
        
        MessageFormat mf = new MessageFormat(mensaje);
        System.out.println(mf.format(new Object[]{ahora, valor}));
        
        System.out.println();
        
        mf.setLocale(Locale.TAIWAN);
        System.out.println(mf.format(new Object[]{ahora, valor}));
    }
}
