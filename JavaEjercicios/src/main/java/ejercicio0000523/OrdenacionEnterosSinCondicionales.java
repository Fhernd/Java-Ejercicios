package ejercicio0000523;

/**
 * Ejercicio 523: Ordenar tres números enteros de forma ascendente sin usar condicionales (estructura if).
 *
 * @author John Ortiz Ordoñez
 */
public class OrdenacionEnterosSinCondicionales {
    
    public static void main(String[] args) {
        
        int x = 3;
        int y = 2;
        int z = 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        System.out.println();
        
        int a = Math.min(Math.min(x, y), z);
        int c = Math.max(Math.max(x, y), z);
        int b = (x + y + z) - a - c;
        
        System.out.println(a);  // 1
        System.out.println(b);  // 2
        System.out.println(c);  // 3
    }
}
