package ejercicio0000356;

/**
 * Ejercicio 356: Crear una interfaz con métodos predeterminados (default).
 * 
 * @author John Ortiz Ordoñez
 */
public interface Radio {
    void encender();
    void apagar();
    
    default String conectar() {
        return "El radio se ha conectado a la fuente eléctrica.";
    }
    
    default String desconectar() {
        return "El radio se ha desconectado de la fuente eléctrica.";
    }
}
