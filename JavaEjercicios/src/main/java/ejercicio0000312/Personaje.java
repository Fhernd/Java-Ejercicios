package ejercicio0000312;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Personaje {
    private String nombre;
    private int nivelVida;

    public Personaje() {
    }

    public Personaje(String nombre, int nivelVida) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }    
}
