package co.gestorbdcursos.modelos;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Estudiante {
    private String dui;
    private String nombreCompleto;
    private String correo;
    private String especialidad;
    private String fechaInscripcion;

    public Estudiante() {
    }

    public Estudiante(String dui, String nombreCompleto, String correo, String especialidad, String fechaInscripcion) {
        this.dui = dui;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.especialidad = especialidad;
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
