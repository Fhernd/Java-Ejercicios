package ejercicio0000053;

import org.apache.commons.validator.routines.DateValidator;
import org.apache.commons.validator.routines.DoubleValidator;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.IntegerValidator;
import org.apache.commons.validator.routines.TimeValidator;

/**
 * Ejercicio 53: Validar objetos String con Apache Commons Validator.
 * 
 * @author John Ortiz Ordoñez
 */
public class Validaciones {
    public static void main(String[] args) {
        String fecha = "2019/04/11";
        String email = "edward@gmail.com";
        String edad = "32";
        String salario = "5000.99";
        String hora = "08:00";
        
        // Validación fecha:
        DateValidator dateValidator = new DateValidator();
        
        System.out.println(dateValidator.validate(fecha, "yyyy/MM/dd"));
        
        // Validación email:
        EmailValidator emailValidator = EmailValidator.getInstance();
        
        System.out.println(emailValidator.isValid(email));
        
        // Validación enteros:
        IntegerValidator integerValidator = IntegerValidator.getInstance();
        
        System.out.println(integerValidator.isValid(edad));
        
        // Validación reales:
        DoubleValidator doubleValidator = DoubleValidator.getInstance();
        System.out.println(doubleValidator.isValid(salario));
        
        // Validación hora:
        TimeValidator timeValidator = TimeValidator.getInstance();
        System.out.println(timeValidator.isValid(hora, "HH:mm"));
    }
}
