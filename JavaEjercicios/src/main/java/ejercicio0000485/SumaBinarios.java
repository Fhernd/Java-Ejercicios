package ejercicio0000485;

/**
 * Ejercicio 485: Definir una función para sumar dos números binarios.
 *
 * @author John Ortiz Ordoñez
 */
public class SumaBinarios {

    public static void main(String[] args) {
        
        int numero1 = 111;
        int numero2 = 1000;
        
        Resultado resultado = sumar(numero1, numero2);
        
        System.out.println("Resultado:");
        while(resultado.i >= 0) {
            System.out.print(resultado.suma[resultado.i]);
            --resultado.i;
        }
    }
    
    public static Resultado sumar(int a, int b) {
        int[] suma = new int[20];
        
        int i = 0;
        int residuo = 0;
        
        while(a != 0 || b != 0) {
            suma[i] = (int)((a % 10 + b % 10 + residuo) % 2);
            residuo = (int)((a % 10 + b % 10 + residuo) / 2);
                
            a /= 10;
            b /= 10;
            ++i;
        }
        
        if (residuo != 0) {
            suma[i] = residuo;
            ++i;
        }
        
        --i;
        
        Resultado resultado = new Resultado();
        resultado.i = i;
        resultado.suma = suma;
        
        return resultado;
    }
}

class Resultado {
    public int[] suma;
    public int i;
}
