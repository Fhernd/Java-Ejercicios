package ejercicio0000159;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * Ejercicio 159: Guardar y Restaurar Objetos
 * 
 * @author John Ortiz Ordoñez
 */
public class PersistenciaObjetos {

    public static void main(String[] args) {
        
        Persona edward = new Persona("Edward", "Ortiz");
        Persona daniela = new Persona("Daniela", "Ordoñez");
        
        final String NOMBRE_ARCHIVO = "personas.bin";
        
        // Escritura de objetos:
        try {
            OutputStream os = new FileOutputStream(NOMBRE_ARCHIVO);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            
            oos.writeObject(edward);
            oos.writeObject(daniela);
            
            oos.close();
            
            System.out.println("La escritura se ha completado.");
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
        
        System.out.println("");
        
        // Lectura de objetos:
        try {
            InputStream is = new FileInputStream(NOMBRE_ARCHIVO);
            ObjectInputStream ois = new ObjectInputStream(is);
            
            Persona persona = (Persona) ois.readObject();
            
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            
            System.out.println("");
            
            persona = (Persona) ois.readObject();
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    
}
