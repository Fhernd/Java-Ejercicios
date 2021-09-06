package ejercicio0000592;

/**
 * Ejercicio 592: Calcular el promedio de un grupo de números almacenados en un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class CalculoPromedio {

    public static void main(String[] args) {
        int[] numeros = {7, 13, 2, 5, 29, 23, 17, 3, 31, 11};
        
        double resultado = calcularPromedio(numeros);
        
        System.out.printf("El promedio es igual: %.3f\n", resultado);
    }
    
    public static double calcularPromedio(int[] numeros) {
        double suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        return numeros.length != 0 ? suma / numeros.length : 0;
    }
}
