package ejercicio0000408;

/**
 * Ejercicio 408: Generar números reales aleatorios usando el método static 
 * Math.random().
 *
 * @author John Ortiz Ordoñez
 */
public class GeneracionAleatorios {

    public static void main(String[] args) {
        
        // Math.random(): genera números reales aleatorios en el rango 
        // [0.0, 1.0)
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random());
        }
        
        System.out.println();
        
        // Aplicación: simular el lanzamiento de un dado de 6 caras.
        for (int i = 1; i <= 20; i++) {
            System.out.println(simularLanzamientoDado());
        }
    }
    
    public static int simularLanzamientoDado() {
        return 1 + (int) (Math.random() * 6);
    }
}
