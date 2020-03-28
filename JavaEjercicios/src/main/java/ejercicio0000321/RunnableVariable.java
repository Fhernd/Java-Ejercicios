package ejercicio0000321;

/**
 * Ejercicio 321: Crear una instancia de Runnable como una expresión lambda.
 * 
 * @author John Ortiz Ordoñez
 */
public class RunnableVariable {

    public static void main(String[] args) {
        
        Runnable runnable = () -> {
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                return;
            }
            System.out.println("Se ha creado una instancia de Runnable utilizando una expresión lambda.");
        };
        
        Thread thread = new Thread(runnable);
        
        thread.start();
    }
}
