package ejercicio0000445;

/**
 * Ejercicio 445: Crear un JavaBean para representar una entidad del mundo 
 * real.
 *
 * @author John Ortiz Ordoñez
 */
public class DemostracionJavaBean {

    public static void main(String[] args) {
        
        Computador portatilGamer = new Computador(1001, "MSi", "Intel Core i7", 32, 720);
        
        System.out.println(portatilGamer);
        
        System.out.println();
        
        Computador desktop = new Computador(1002, "Clone", "Intel Core i7", 128, 10000);
        
        System.out.println(desktop);
    }
            
}
