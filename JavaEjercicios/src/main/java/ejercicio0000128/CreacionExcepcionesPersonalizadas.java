package ejercicio0000128;

/**
 * Ejercicio 128: Creación de excepciones personalizadas.
 *
 * @author John Ortiz Ordoñez
 */
public class CreacionExcepcionesPersonalizadas {

    public static void main(String[] args) {

        Archivo archivo = new Archivo("notpad", "txt");
        
        try {
            archivo.setExtension("docx");
            
        } catch(ExtensionNoPermitidaException e){
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}

class Archivo{
    private String nombre;
    private String extension;

    public Archivo(String nombre, String extension) {
        this.nombre = nombre;
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) throws ExtensionNoPermitidaException {
        if (extension.toLowerCase().equals("txt"))
            this.extension = extension;
        else{
            throw new ExtensionNoPermitidaException("La extensión " + extension + " no está permitido.");
        }
    }
    
    
}

class ExtensionNoPermitidaException extends Exception {

    public ExtensionNoPermitidaException() {
        super();
    }

    public ExtensionNoPermitidaException(String message) {
        super(message);
    }
    
}
