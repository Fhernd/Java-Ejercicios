package ejercicio0000536;

/**
 * Ejercicio 536: Validar si el primer y último elemento de un arreglo son iguales.
 *
 * @author John Ortiz Ordoñez
 */
public class ElementosIgualesArreglo {

    public static void main(String[] args) {
        
        int valor = 10;
        
        int[] numeros = {10, 5, 3, 2, 10};
        
        boolean resultado = numeros[0] == valor && numeros[numeros.length - 1] == valor;
        
        System.out.println(resultado);  // true
        
        System.out.println();
        
        numeros[numeros.length - 1] = 20;
        
        resultado = numeros[0] == valor && numeros[numeros.length - 1] == valor;
        
        System.out.println(resultado);  // false
    }
}
