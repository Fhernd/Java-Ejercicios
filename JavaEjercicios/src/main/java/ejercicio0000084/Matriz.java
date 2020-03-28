package ejercicio0000084;

/**
 * Ejercicio 84: Computar la multiplicación de dos matrices.
 * 
 * @author John Ortiz Ordoñez
 */
public class Matriz {
    public int[][] multiplicar(int[][] A, int[][] B){
        int filasA = A.length;
        int columnasA = A[0].length;
        int filasB = B.length;
        int columnasB = B[0].length;
        
        if (columnasA != filasB){
            throw new IllegalArgumentException("La cantidad de columnas de la matriz A no es igual a la cantidad de filas de la matriz B.");
        }
        
        int[][] resultado = new int[filasA][columnasB];
        
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return resultado;
    }
    
    
    public static void main(String[] args) {
        int[][] A = {{3, 2, 3}, {5, 9, 8}};
        int[][] B = {{4, 7}, {9, 3}, {8, 1}};
        
        Matriz matriz = new Matriz();
        
        int[][] resultado = matriz.multiplicar(A, B);
        
        for (int[] fila : resultado) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
    }
}
