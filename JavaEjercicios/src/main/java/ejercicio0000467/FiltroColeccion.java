package ejercicio0000467;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 467: Usar una expresión lambda para filtrar objetos de una colección.
 * 
 * @author John Ortiz Ordoñez
 */
public class FiltroColeccion {

    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador(1001, "Pedro Gómez", 7));
        jugadores.add(new Jugador(1002, "Alexander Meneses", 5));
        jugadores.add(new Jugador(1003, "Roberto Hurtado", 2));
        jugadores.add(new Jugador(1004, "Carlos Artunduaga", 3));
        jugadores.add(new Jugador(1004, "Cristián Ocampo", 1));
        
        jugadores.forEach(j -> System.out.println(j.getNombre()));
        
        System.out.println();
        
        List<Jugador> jugadoresFiltro = new ArrayList<>();
        
        jugadores.stream().filter(j -> j.getPosicion() >= 3).forEach(j -> jugadoresFiltro.add(j));
        
        jugadoresFiltro.forEach(j -> System.out.println(j.getNombre()));
    }
    
}

class Jugador {
    private int id;
    private String nombre;
    private int posicion;

    public Jugador() {
    }

    public Jugador(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public Jugador(int id, String nombre, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
