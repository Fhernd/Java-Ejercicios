package ejercicio0000314;

/**
 * Ejercicio 314: Usar una expresión lambda (Java 8) para crear threads.
 *
 * @author John Ortiz Ordoñez
 */
public class InstanciaThreadLambda {

    private String mensaje;
    private int contador;

    public InstanciaThreadLambda(String mensaje, int contador) {
        this.mensaje = mensaje;
        this.contador = contador;

        new Thread(() -> {
            while (InstanciaThreadLambda.this.contador > 0) {
                try {
                    System.out.println("MENSAJE: " + mensaje);

                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    System.err.println("ERROR: " + ex.getMessage());
                }

                --InstanciaThreadLambda.this.contador;
            }
        }).start();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public static void main(String[] args) {
        new InstanciaThreadLambda("Thread No. 1", 15);
        new InstanciaThreadLambda("Thread No. 2", 20);
    }
}
