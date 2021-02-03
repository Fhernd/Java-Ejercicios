package ejercicio0000486;

/**
 * Ejercicio 486: Definir una función para multiplicar dos números binarios.
 *
 * @author John Ortiz Ordoñez
 */
public class ProductoBinarios {

    public static void main(String[] args) {
        
        int binario1 = 10;  // 2
        int binario2 = 10000;   // 16
    }
    
    public static void multiplicarBinarios(int a, int b) {
        int producto = 0;
        int digito;
        int factor = 1;
        
        while (b != 0) {
            digito = (int) (b % 10);
            
            if (digito == 1) {
                a = b * factor;
                producto = calculoProducto((int) a, (int) producto);
            }
        }
    }

    private static int calculoProducto(int a, int b) {
        int i = 0;
        int residuo = 0;
        int productoBinario = 0;
        int[] suma = new int[20];
        
        while (a != 0 || b != 0) {
            suma[i] = (a % 10 + b % 10 + residuo) % 2;
            residuo = (a % 10 + b % 10 + residuo) / 2;
            
            a /= 10;    // a = a / 10
            b /= 10;
            
            ++i;
        }
        
        if (residuo != 0) {
            suma[i] = residuo;
            
            ++i;
        }
        
        --i;
        
        while (i >= 0) {
            productoBinario = productoBinario * 10 + suma[i];
            --i;
        }
        
        return productoBinario;
    }
}
