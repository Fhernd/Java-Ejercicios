package co.matrices;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.CholeskyDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Ejercicio 54: Computar operaciones matriciales con la librería 
 * Apache Commons Math.
 * 
 * @author John Ortiz Ordoñez
 */
public class OperacionesMatriciales {
    public static void main(String[] args) {
        double[][] A = {{11, 3}, {7, 11}};
        double[][] B = {{8, 0, 1}, {0, 3, 5}};
        double[][] C = {{4, 12, -16}, {12, 37, -43}, {-16, -43, 98}};
        
        RealMatrix matrizA = new Array2DRowRealMatrix(A);
        RealMatrix matrizB = new Array2DRowRealMatrix(B);
        RealMatrix matrizC = new Array2DRowRealMatrix(C);
        
        // Suma:
        RealMatrix sumaA = matrizA.add(matrizA);
        
        System.out.println(sumaA);
        
        System.out.println("");
        
        // Multiplicación:
        RealMatrix multiplicacionAB = matrizA.multiply(matrizB);
        
        System.out.println(multiplicacionAB);
        
        System.out.println("");
        
        // Potencia:
        RealMatrix potencia = matrizA.power(2);
        
        System.out.println(potencia);
        
        System.out.println("");
        
        // Obtener fila:
        double[] fila1MatrizC = matrizC.getRow(0);
        
        for (double d : fila1MatrizC) {
            System.out.print(d);
            System.out.print(" ");
        }
        
        System.out.println("");
        
        // Obtener columna:
        double[] columna1MatrizC = matrizC.getColumn(0);
        
        for (double d : columna1MatrizC) {
            System.out.print(d);
            System.out.print(" ");
        }
        
        System.out.println("");
        
        // Obtener una componente particular:
        double componente = matrizC.getEntry(0, 2);
        
        System.out.println(componente);
        
        System.out.println("");
        
        // Transpuesta:
        RealMatrix transpuestaC = matrizC.transpose();
        
        System.out.println(transpuestaC);
        
        System.out.println("");
        
        // Descomposición o factorización de Cholesky:
        CholeskyDecomposition cd = new CholeskyDecomposition(matrizC);
        
        RealMatrix L = cd.getL();
        RealMatrix LT = cd.getLT();
        
        RealMatrix LLT = L.multiply(LT);
        
        System.out.println(LLT);
    }
}
