package ejercicio0000122;

/**
 * Ejercicio 122: Uso de clases abstractas.
 * 
 * @author John Ortiz Ordoñez
 */
public class ClasesAbstractas {
    
    public static void main(String[] args) {
        
        Figura triangulo = new Triangulo(5, 3);
        
        System.out.println(triangulo.calcularArea());
    }
}

abstract class Figura {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
}

class Triangulo extends Figura {

    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
        return altura * base / 2;
    }
    
}
