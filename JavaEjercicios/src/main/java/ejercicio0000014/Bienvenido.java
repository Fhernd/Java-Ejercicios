package ejercicio0000014;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Bienvenido {
    public void saludar(){
        System.out.println("¡Hola... Bievenido a Java!");
    }
    
    public static void main(String[] args){
        Bienvenido bienvenido = new Bienvenido();
        
        bienvenido.saludar();
    }
}
