package ejercicio0000074;

/**
 * Ejercicio 74: Comparar números de punto flotante (float).
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionFloats {

    final static double EPSILON = 0.0000001;

    public static void main(String[] args) {
        double numero1 = 0.3333333333 * 3;
        double numero2 = 0.99999992857;
        
        if (numero1 == numero2){
            System.out.println(numero1 + " == " + numero2);
        } else {
            System.out.println(numero1 + " != " + numero2);
        }
        
        if (iguales(numero1, numero2, EPSILON)){
            System.out.println(numero1 + " == " + numero2 + " con una tolerancia de " + EPSILON);
        }
        
        // Comparación de NaNs:
        System.out.println("\nComparación de NaNs:");
        double numero3 = Double.NaN;
        double numero4 = Double.NaN;
        
        if (numero3 == numero4){
            System.out.println(numero3 + " == " + numero4);
        } else {
            System.out.println(numero3 + " != " + numero4);
        }
        
        if (new Double(numero3).equals(new Double(numero4))){
            System.out.println(numero3 + " == " + numero4);
        }
    }

    public static boolean iguales(double a, double b, double tolerancia) {
        if (a == b) {
            return true;
        }
        
        return Math.abs(a - b) < tolerancia;
    }
}
