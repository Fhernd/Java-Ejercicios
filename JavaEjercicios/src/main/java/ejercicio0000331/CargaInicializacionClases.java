package ejercicio0000331;

/**
 * Ejercicio 331: Cargar e instanciar una clase de forma dinámica con Reflection API.
 * 
 * @author John Ortiz Ordoñez
 */
public class CargaInicializacionClases {

    public static void main(String[] args) {
        try {
            Persona persona = null;
            
            Class<Persona> clase = (Class<Persona>) Class.forName("ejercicio0000331.Persona");
            persona = clase.newInstance();
            
            persona.setDocumento("123456");
            persona.setNombreCompleto("Edward Ortiz Ordoñez");
            persona.setEdad(27);    
            
            System.out.println("Documento: " + persona.getDocumento());
            System.out.println("Nombre completo: " + persona.getNombreCompleto());
            System.out.println("Edad: " + persona.getEdad());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

class Persona {
    private String documento;
    private String nombreCompleto;
    private int edad;

    public Persona() {
    }

    public Persona(String documento, String nombreCompleto, int edad) {
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
