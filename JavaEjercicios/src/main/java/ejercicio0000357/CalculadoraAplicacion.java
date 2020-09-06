package ejercicio0000357;

/**
 * 
 *
 * @author John Ortiz Ordoñez
 */
public class CalculadoraAplicacion {

    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraEstandar();
        
        System.out.println(calculadora.sumar(1, 2));
        System.out.println(calculadora.restar(1, 2));
        
        System.out.println();
        
        double[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(calculadora.sumarNumerosPares(numeros));
        System.out.println(calculadora.sumarNumerosImpares(numeros));
    }
}
