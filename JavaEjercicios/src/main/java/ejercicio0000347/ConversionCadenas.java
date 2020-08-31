package ejercicio0000347;

/**
 * Ejercicio 347: Conversión de un valor numérico a una cadena de caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionCadenas {

    public static void main(String[] args) {
        int edad = 29;
        float ahorros = 1_000_000.00F;
        double area = Math.PI * Math.pow(5, 2);
        
        System.out.println(edad);
        System.out.println(String.valueOf(edad));
        System.out.println();
        System.out.println(String.valueOf(ahorros));
        System.out.println(String.valueOf(area));
        
        System.out.println();
        
        String texto = String.valueOf(edad) + String.valueOf(ahorros) + String.valueOf(area);
        System.out.println(texto);
    }
}
