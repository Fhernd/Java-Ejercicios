package ejercicio0000289;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Persona {
    private int id;
    private String nombre;
    private String correoElectronico;

    public Persona() {
    }

    public Persona(int id, String nombre, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }    
}
