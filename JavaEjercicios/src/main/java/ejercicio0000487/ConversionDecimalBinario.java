package ejercicio0000487;

/**
 * Ejercicio 487: Crear una función personalizada para convertir un número 
 * decimal en un número binario.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionDecimalBinario {

    public static void main(String[] args) {
        
        int numeroDecimal = 10;  // 1010
        
        Resultado resultado = convertirABinario(numeroDecimal);
        
        for(int i = resultado.i - 1; i > 0; --i) {
            System.out.print(resultado.binario[i]);
        }
    }
    
    public static Resultado convertirABinario(int numeroDecimal) {
        int[] binario = new int[100];
        int cociente;
        int i = 1;
        
        cociente = numeroDecimal;
        
        while (cociente != 0) {
            binario[i] = cociente % 2;
            cociente /= 2;
            
            ++i;
        }
        
        Resultado resultado = new Resultado();
        resultado.binario = binario;
        resultado.i = i;
        
        return resultado;
    }
}

class Resultado {
    public int[] binario;
    public int i;
}
