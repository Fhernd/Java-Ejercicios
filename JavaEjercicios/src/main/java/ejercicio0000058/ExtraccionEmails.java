package ejercicio0000058;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 58: Encontrar las direcciones de correo electrónico 
 * en un texto.
 * 
 * @author John Ortiz Ordoñez
 */
public class ExtraccionEmails {

    public static void main(String[] args) {
        String csv = "id,nombre,email\n"
                + "1,Aurelia,magna@vitae.ca\n"
                + "2,Hayes,amet.consectetuer@Vestibulumut.net\n"
                + "3,Dakota,tortor@convallis.com\n"
                + "4,Leonard,velit.egestas@vehicula.com\n"
                + "5,Cameron,neque.sed@pharetranibh.ca\n"
                + "6,Amela,placerat@dignissim.org\n"
                + "7,Allistair,aliquet.sem.ut@lobortisnisi.co.uk\n"
                + "8,Jacob,nullam.ut.nisi@pellentesquea.net\n";
        
        String patron = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(csv);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
