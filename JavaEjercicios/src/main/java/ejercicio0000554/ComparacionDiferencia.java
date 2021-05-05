package ejercicio0000554;

/**
 * Ejercicio 554: Contar los elementos de dos arreglos cuya diferencia sea igual a 1.
 *
 * @author John Ortiz Ordoñez.
 */
public class ComparacionDiferencia {

    public static void main(String[] args) {
        
        int numeros1[] = {13, 17, 9, 11, 10};
        int numeros2[] = {15, 16, 2, 19, 9};
        
        int resultado = contarElementosDiferencia1(numeros1, numeros2);
        System.out.println(resultado);  // 2
    }
    
    public static int contarElementosDiferencia1(int[] numeros1, int[] numeros2) {
        if (numeros1.length != numeros2.length) {
            return -1;
        }
        
        int cantidadElementos = numeros1.length;
        int conteo = 0;
        
        for (int i = 0; i < cantidadElementos; i++) {
            if (Math.abs(numeros1[i] - numeros2[i]) == 1) {
                ++conteo;
            }
        }
        
        return conteo;
    }
}
