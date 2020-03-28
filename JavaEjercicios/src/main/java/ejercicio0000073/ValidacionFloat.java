package ejercicio0000073;

/**
 * Ejercicio 73: Validar los resultados de operaciones con números de 
 * punto flotante (float).
 * 
 * @author John Ortiz Ordoñez
 */
public class ValidacionFloat {
    public static void main(String[] args) {
        double resultado1 = 5/0.0;
        double resultado2 = -5/0.0;
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        
        double resultado3 = Math.sqrt(-1);
        
        System.out.println(resultado3);
        
        if(resultado3 == Double.NaN){
            System.out.println("Primer condicional. El número no es válido: es NaN.");
        }
        
        if (Double.isNaN(resultado3)){
            System.out.println("Segundo condicional. El número no es válido: es NaN.");
        }
        
        if(Double.isInfinite(resultado1)){
            System.out.println("Es infinito positivo.");
        }
    }
}
