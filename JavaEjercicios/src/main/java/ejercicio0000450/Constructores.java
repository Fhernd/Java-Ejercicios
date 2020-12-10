package ejercicio0000450;

/**
 * Ejercicio 450: Crear una clase con diferentes firmas de constructores.
 *
 * @author John Ortiz Ordoñez
 */
public class Constructores {

    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.getDocumento());
        System.out.println(persona.getEmail());
        System.out.println(persona.getCantidadDinero());
        
        System.out.println();
        
        Persona julio = new Persona("123456789");
        julio.setNombres("Julio");
        System.out.println(julio.getDocumento());
        System.out.println(julio.getNombres());
        System.out.println(julio.getEmail());
        System.out.println(julio.getCantidadDinero());
        
        System.out.println();
        
        Persona daniela = new Persona("987654321", "Ortiz", "Daniela");
        System.out.println(daniela.getDocumento());
        System.out.println(daniela.getNombres());
        System.out.println(daniela.getEmail());
        System.out.println(daniela.getCantidadDinero());
    }
}

class Persona {
    private String documento;
    private String apellidos;
    private String nombres;
    private String email;
    private double cantidadDinero;
    
    public Persona() {
        
    }
    
    public Persona(String documento) {
        this.documento = documento;
    }
    
    public Persona(String documento, String apellidos, String nombres) {
        this(documento);
        
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    
    public Persona(String documento, String apellidos, String nombres, String email, double cantidadDinero) {
        this(documento, apellidos, nombres);
        
        this.email = email;
        this.cantidadDinero = cantidadDinero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }
}
