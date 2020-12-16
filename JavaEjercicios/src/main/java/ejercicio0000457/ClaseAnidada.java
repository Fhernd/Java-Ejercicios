package ejercicio0000457;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 457: Crear una clase anidada dentro de otra clase.
 *
 * @author John Ortiz Ordoñez
 */
public class ClaseAnidada {

    public static void main(String[] args) {
        
        EquipoBaloncesto equipo = new EquipoBaloncesto("Equipo Nacional de Baloncesto", "Colombia");
        
        EquipoBaloncesto.Jugador jugadorCapitan = equipo.new Jugador("Edward Ortiz", 1);
        
        equipo.setCapitan(jugadorCapitan);
        
        equipo.agregarJugador(equipo.new Jugador("Julio Meneses", 2));
        equipo.agregarJugador(equipo.new Jugador("Alexander Pérez", 3));
    }
}

class EquipoBaloncesto {
    private String nombre;
    private Jugador capitan;
    private List<Jugador> jugadores;
    private String nacionalidad;

    public EquipoBaloncesto() {
        jugadores = new ArrayList<>();
    }

    public EquipoBaloncesto(String nombre, String nacionalidad) {
        this();
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public EquipoBaloncesto(String nombre, Jugador capitan, String nacionalidad) {
        this(nombre, nacionalidad);
        this.capitan = capitan;
    }

    public EquipoBaloncesto(String nombre, Jugador capitan, List<Jugador> jugadores, String nacionalidad) {
        this(nombre, capitan, nacionalidad);
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public class Jugador {
        private String nombre;
        private int posicion;

        public Jugador() {
        }

        public Jugador(String nombre, int posicion) {
            this.nombre = nombre;
            this.posicion = posicion;
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

        @Override
        public String toString() {
            return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + '}';
        }
    }
}
