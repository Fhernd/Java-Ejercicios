package ejercicio0000348;

/**
 * Ejercicio 348: Convertir una cadena de caracteres a un valor numérico.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionNumero {

    public static void main(String[] args) {
        String cadena = "123";
        System.out.println("El contenido de la variable «cadena» es: " + cadena);

        System.out.println();

        int numero;
        numero = Integer.parseInt(cadena);
        System.out.printf("El contenido de la variable «numero» es: %d", numero);

        System.out.println();

        cadena = "123a";
        System.out.println("El contenido de la variable «cadena» es: " + cadena);

        System.out.println();

        try {
            numero = Integer.parseInt(cadena);
            System.out.printf("El contenido de la variable «numero» es: %d", numero);
        } catch (NumberFormatException e) {
            System.out.println("La conversión a entero ha fallado.");
        }
        
        System.out.println();
        
        cadena = "123.456";
        System.out.println("El contenido de la variable «cadena» es: " + cadena);
        
        double numeroReal;
        numeroReal = Double.parseDouble(cadena);
        System.out.printf("El contenido de la variable «numeroReal»: %f\n", numeroReal);
        
        System.out.println();
        
        cadena = "123.456a";
        try{
        numeroReal = Double.parseDouble(cadena);
        System.out.printf("El contenido de la variable «numeroReal»: %f\n", numeroReal);
        } catch(NumberFormatException e) {
            System.out.println("La conversión a real ha fallado.");
        }
    }
}
