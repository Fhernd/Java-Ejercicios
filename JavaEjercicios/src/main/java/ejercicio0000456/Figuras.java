package ejercicio0000456;

/**
 * Ejercicio 456: Crear una jerarquía de herencia a partir de una clase 
 * abstracta.
 *
 * @author John Ortiz Ordoñez
 */
public class Figuras {

    public static void main(String[] args) {
        Figura figuras[] = new Figura[2];
        figuras[0] = new Rectangulo(5, 7, "Rojo", true);
        figuras[1] = new Triangulo(3, 10, "Verde", false);
        
        for (Figura e : figuras) {
            System.out.println(e.area());
        }
    }
}

abstract class Figura {
    
    private String color;
    private boolean relleno;

    public Figura() {
    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    abstract double area();
}

class Rectangulo extends Figura {
    
    private double ancho;
    private double alto;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    double area() {
        return ancho * alto;
    }    
}

class Triangulo extends Figura {
    
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String color, boolean relleno) {
        super(color, relleno);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double area() {
        return base * altura / 2.0;
    }
}
