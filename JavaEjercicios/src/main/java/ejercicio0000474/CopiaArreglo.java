package ejercicio0000474;

/**
 * Ejercicio 474: Crear una copia completa de un arreglo utilizando un ciclo for.
 * 
 * @author John Ortiz Ordoñez
 */
public class CopiaArreglo {

    public static void main(String[] args) {
        
        int numeros[] = {10, 20, 30};
        
        int copiaNumeros[] = new int[numeros.length];
        
        copiaNumeros = numeros;
        
        mostrarContenido(numeros);
        System.out.println();
        mostrarContenido(copiaNumeros);
        
        System.out.println();
        System.out.println();
        
        ++numeros[0];
        
        mostrarContenido(numeros);
        System.out.println();
        mostrarContenido(copiaNumeros);
        
        System.out.println();
        System.out.println();
        
        System.out.println(numeros);
        System.out.println(copiaNumeros);
        
        System.out.println();
        System.out.println();
        
        int copia[] = new int[numeros.length];
        
        System.out.println(numeros);
        System.out.println(copiaNumeros);
        System.out.println(copia);
        
        System.out.println();
        System.out.println();
        
        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }
        
        mostrarContenido(numeros);
        System.out.println();
        mostrarContenido(copia);
        
        System.out.println();
        System.out.println();
        
        ++numeros[0];
        
        mostrarContenido(numeros);
        System.out.println();
        mostrarContenido(copia);
    }
    
    public static void mostrarContenido(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
