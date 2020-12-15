package ejercicio0000453;

/**
 * Ejercicio 453: Usar el método clone() de la clase Object para clonar un 
 * objeto.
 *
 * @author John Ortiz Ordoñez
 */
public class ClonacionObjeto {

    public static void main(String[] args) {
        
        try {
            Estudiante edward = new Estudiante("20200212345", "Edward Ortiz");
            System.out.println(edward);
            
            System.out.println();
            
            Estudiante cloneEdward = (Estudiante) edward.clone();
            System.out.println(cloneEdward);
        } catch (Exception e) {
        }
    }
}

class Estudiante implements Cloneable {
    private String codigo;
    private String nombres;

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombres) {
        this.codigo = codigo;
        this.nombres = nombres;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombres=" + nombres + '}';
    }
}
