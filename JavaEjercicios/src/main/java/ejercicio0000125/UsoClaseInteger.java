package ejercicio0000125;

/**
 * Ejercicio 125: Uso de la clase Integer como envoltura (wrapper)
 * de enteros.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoClaseInteger {

    public static void main(String[] args) {
        
        Integer numero1 = 42;
        Integer numero2 = new Integer("42");
        Integer numero3 = Integer.getInteger("42");
        Integer numero4 = Integer.parseInt("42");
        
        System.out.println(numero1);
        System.out.println(numero1.toString());
    }
}
