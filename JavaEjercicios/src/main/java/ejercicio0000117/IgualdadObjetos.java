package ejercicio0000117;

/**
 * Ejercicio 117: Sobreescribir el método equals de Object.
 * 
 * @author John Ortiz Ordoñez
 */
public class IgualdadObjetos {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Edward", "Ortiz");
        Persona persona2 = new Persona("Edward", "Ortiz");
        
        System.out.println("¿Son homónimos? " + persona1.equals(persona2));
    }
}

class Persona extends Object{
    private String nombres;
    private String apellidos;

    public Persona() {
    }

    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
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

    @Override
    public boolean equals(Object otro) {
        
        // 1. Optimización:
        if (this == otro){
            return true;
        }
        
        // 2. No null:
        if (otro == null){
            return false;
        }
        
        // 3: Clase igual:
        if (otro.getClass() != Persona.class){
            return false;
        }
        
        // 4. Comparación campo-a-campo:
        Persona persona = (Persona) otro;
        
        return persona.getNombres().equals(this.nombres) && 
                persona.getApellidos().equals(this.apellidos);
    }
}
