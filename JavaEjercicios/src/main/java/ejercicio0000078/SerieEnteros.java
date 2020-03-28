package ejercicio0000078;

import java.util.BitSet;

/**
 * Ejercicio 78: Operar sobre una secuencia o serie de números enteros.
 * 
 * @author John Ortiz Ordoñez
 */
public class SerieEnteros {
    private static final String[] MESES = {
        "Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"
    };
    
    public static void main(String[] args) {
        System.out.println("Números de los meses:");
        for (int i = 1; i <= MESES.length; i++) {
            System.out.println("Número mes: " + i);
        }
        
        System.out.println("\nMeses del año:");
        for (int i = 0; i < MESES.length; i++) {
            System.out.println("Mes: " + MESES[i]);
        }
        
        System.out.println("\nRango números enteros:");
        for (int i = 29; i <= 53; i++) {
            System.out.println(i);
        }
        
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(4);
        bitSet.set(9);
        System.out.println("\nSecuencia discontinua con BitSet: ");
        for (int i = 0; i < MESES.length; i++) {
            if(bitSet.get(i)){
                System.out.println("Mes: " + MESES[i]);
            }
        }
        
        int[] numerosMeses = {0, 4, 9};
        System.out.println("\nSecuencia discontinua con arreglo: ");
        for (int numeroMes : numerosMeses) {
            System.out.println("Mes: " + MESES[numeroMes]);
        }
    }
}
