package ejercicio0000306;

import java.util.List;

/**
 * Ejercicio 306: Crear una clase personalizada como un JavaBean.
 * 
 * @author John Ortiz Ordoñez
 */
public class Autor {

    private int id;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private List<String> libros;
    private String nacionalidad;
    private List<String> premios;

    public Autor() {
    }

    public Autor(int id, String nombres, String apellidos, String especialidad, List<String> libros, String nacionalidad, List<String> premios) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.libros = libros;
        this.nacionalidad = nacionalidad;
        this.premios = premios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<String> getLibros() {
        return libros;
    }

    public void setLibros(List<String> libros) {
        this.libros = libros;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<String> getPremios() {
        return premios;
    }

    public void setPremios(List<String> premios) {
        this.premios = premios;
    }
}
