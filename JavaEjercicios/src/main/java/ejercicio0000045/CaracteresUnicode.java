package ejercicio0000045;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class CaracteresUnicode {
    public static void main(String[] args){
        StringBuilder cadena = new StringBuilder();
        
        cadena.append('\u00a5');
        cadena.append('\u01FC');
        cadena.append('\u0391');
        cadena.append('\u03A9');
        
        System.out.println(cadena);
    }
}
