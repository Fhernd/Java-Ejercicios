package co.gestorbdcursos.modelos;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Matricula {

    private int cursoId;
    private String estudianteDui;
    private String fecha;
    private int calificacion;

    public Matricula() {
    }

    public Matricula(int cursoId, String estudianteDui, String fecha, int calificacion) {
        this.cursoId = cursoId;
        this.estudianteDui = estudianteDui;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getEstudianteDui() {
        return estudianteDui;
    }

    public void setEstudianteDui(String estudianteDui) {
        this.estudianteDui = estudianteDui;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
