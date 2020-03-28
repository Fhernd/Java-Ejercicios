package ejercicio0000075;

/**
 * Ejercicio 75: Redondear números de punto flotante (float).
 * 
 * @author John Ortiz Ordoñez
 */
public class RedondearFlotantes {
    public static void main(String[] args) {
        double numero = 3.5000000001;
        
        System.out.println(Math.round(numero));
        
        System.out.println(Math.floor(numero));
        
        System.out.println(Math.ceil(numero));
    }
}
