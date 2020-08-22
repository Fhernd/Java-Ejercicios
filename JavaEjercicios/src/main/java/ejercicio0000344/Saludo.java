package ejercicio0000344;

/**
 * Ejercicio 344: Crear una clase personalizada para saludar con saludo 
 * predeterminado o personalizado.
 * 
 * @author John Ortiz Ordoñez
 */
public class Saludo {
    
    private String mensaje;
    
    public Saludo() {
        mensaje = "Hola";
    }
    
    public Saludo(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        System.out.println(saludo.getMensaje());
        
        System.out.println();
        
        saludo = new Saludo("Buenos días");
        System.out.println(saludo.getMensaje());
    }
}
