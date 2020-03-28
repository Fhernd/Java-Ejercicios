package ejercicio0000019;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Conversion {
    public static void main(String[] args){
        int numero = 42;
        String cadena = String.valueOf(numero);
        
        System.out.println(cadena);
         
        cadena = String.valueOf(Math.PI);
        
        System.out.println(cadena);
        
        double pi = Double.parseDouble(cadena);
        
        System.out.println(pi);
    }
}
