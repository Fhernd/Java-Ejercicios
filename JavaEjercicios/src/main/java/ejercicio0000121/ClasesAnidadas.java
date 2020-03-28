package ejercicio0000121;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 121: Crear una clase anidada.
 * 
 * @author John Ortiz Ordoñez
 */
public class ClasesAnidadas {

    public static void main(String[] args) {
        
    }
}

class PlanoCartesiano{
    
    private List<PuntoGeometrico> puntos;

    public PlanoCartesiano() {
        puntos = new ArrayList<>();
    }
    
    class PuntoGeometrico{
        private double x;
        private double y;

        public PuntoGeometrico() {
        }

        public PuntoGeometrico(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
    
    public void agregarPuntoGeometrico(PuntoGeometrico punto){
        puntos.add(punto);
    }

    public List<PuntoGeometrico> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<PuntoGeometrico> puntos) {
        this.puntos = puntos;
    }
}
