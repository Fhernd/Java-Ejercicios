package ejercicio0000466;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ejercicio 466: Ordenar una lista/colección de objetos a través de una expresión 
 * lambda.
 * 
 * @author John Ortiz Ordoñez
 */
public class OrdenamientoElementos {
    
    public static void main(String[] args) {
        
        List<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador(1001, "Pedro Gómez", 7));
        jugadores.add(new Jugador(1002, "Alexander Meneses", 5));
        jugadores.add(new Jugador(1003, "Roberto Hurtado", 2));
        jugadores.add(new Jugador(1004, "Carlos Artunduaga", 3));
        jugadores.add(new Jugador(1004, "Cristián Ocampo", 1));
        
        jugadores.forEach(j -> System.out.println(j.getNombre()));
        
        System.out.println();
        
        Collections.sort(jugadores, (j1, j2) -> j1.getNombre().compareTo(j2.getNombre()));
        jugadores.forEach(j -> System.out.println(j.getNombre()));
        
        System.out.println();
        
        Collections.sort(jugadores, (j1, j2) -> new Integer(j1.getPosicion()).compareTo(new Integer(j2.getPosicion())));
        jugadores.forEach(j -> System.out.println(j.getNombre()));
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
