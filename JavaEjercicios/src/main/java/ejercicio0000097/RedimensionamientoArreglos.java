package ejercicio0000097;

/**
 * Ejercicio 97: Redimensionar un arreglo.
 * 
 * @author John Ortiz Ordoñez
 */
public class RedimensionamientoArreglos {
    
    public final static int TAMAÑO_INICIAL = 10;
    public final static int FACTOR_CRECIMIENTO = 2;
    
    public static void main(String[] args) {
        
        int[] arreglo = new int[TAMAÑO_INICIAL];
        
        int contador = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
            
            ++contador;
        }
        
        for(int i = 10; i <= 40; ++i){
            if (contador >= arreglo.length){
                arreglo = redimensionarArreglo(arreglo);
            }
            
            ++contador;
            
            arreglo[i] = i;
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    /**
     * Redimensiona un arreglo de enteros.
     * 
     * @param arreglo Arreglo a redimensionar.
     * @return Nuevo arreglo redimensionado.
     */
    public static int[] redimensionarArreglo(int[] arreglo){
        int[] nuevoArreglo = new int[arreglo.length * FACTOR_CRECIMIENTO];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length);
        
        return nuevoArreglo;
    }
}
