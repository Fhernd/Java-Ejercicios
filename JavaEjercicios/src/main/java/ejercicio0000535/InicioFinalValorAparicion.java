package ejercicio0000535;

/**
 * Ejercicio 535: Validar si un valor aparece al inicio o al final de un arreglo.
 *
 * @author John Ortiz Ordoñez
 */
public class InicioFinalValorAparicion {

    public static void main(String[] args) {
        
        int valor = 5;
        int[] numeros = {3, 7, 5, 11, 13, 2, 13, 5};
        
        boolean resultado = numeros[0] == valor || numeros[numeros.length - 1] == valor;
        System.out.println(resultado);    // true
        
        System.out.println();
        
        numeros[numeros.length - 1] = 29;
        resultado = numeros[0] == valor || numeros[numeros.length - 1] == valor;
        System.out.println(resultado);    // false
    }
}
