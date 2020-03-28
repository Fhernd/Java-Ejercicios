package ejercicio0000116;

/**
 * Ejercicio 116: Cambiar la representación de un objeto con el método 
 * toString.
 * 
 * @author John Ortiz Ordoñez
 */
public class RepresentacionStringObjetos {

    public static void main(String[] args) {
        
        Coordenada coordenada = new Coordenada(5, 3);
        System.out.println(coordenada);
        
        // (x, y):
    }
}

class Coordenada extends Object {
    private int x;
    private int y;

    public Coordenada() {
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +x + ", " + y + ")";
    }
}
