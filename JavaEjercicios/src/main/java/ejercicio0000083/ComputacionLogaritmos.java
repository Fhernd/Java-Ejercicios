package ejercicio0000083;

/**
 * Ejercicio 83: Computar logaritmos en una base arbitraria.
 * 
 * @author John Ortiz Ordoñez
 */
public class ComputacionLogaritmos {
    public static void main(String[] args) {
        System.out.println(Math.log(100));
        System.out.println(Math.log10(100));
        System.out.println(Math.log10(-1));
        
        System.out.println(calcularLogaritmoBaseN(10, 100));
        
        System.out.println(calcularLogaritmoBaseN(8, 200));
    }
    
    public static double calcularLogaritmoBaseN(double base, double valor){
        return Math.log(valor) / Math.log(base);
    }
}
