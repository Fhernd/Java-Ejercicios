package ejercicio0000312;

/**
 * Ejercicio 312: Implementar la interfaz Runnable para ejecutar código en diferentes threads.
 *
 * @author John Ortiz Ordoñez
 */
public class Soldado extends Personaje implements Runnable {

    private int numeroMedallas;

    public Soldado() {
    }

    public Soldado(int numeroMedallas, String nombre, int nivelVida) {
        super(nombre, nivelVida);
        this.numeroMedallas = numeroMedallas;
        
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        while (getNivelVida() > 0) {

            System.out.println("Se está jugando con el soldado: " + getNombre());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                return;
            }
            
            setNivelVida(getNivelVida() - 1);
        }
    }
    
    public static void main(String[] args) {
        new Soldado(10, "Soldado 1", 30);
        new Soldado(15, "Soldado 2", 20);
    }
}
