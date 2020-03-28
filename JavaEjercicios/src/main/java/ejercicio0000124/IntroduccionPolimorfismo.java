package ejercicio0000124;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 124: Introducción al polimorfismo.
 * 
 * @author John Ortiz Ordoñez
 */
public class IntroduccionPolimorfismo {

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        
        Figura triangulo = new Triangulo(5, 3);
        figuras.add(triangulo);
        
        Figura cuadrado = new Cuadrado(7);
        figuras.add(cuadrado);
        
        Figura circulo = new Circulo(11);
        figuras.add(circulo);
        
        for (Figura figura : figuras) {
            System.out.printf("\n" + figura.calcularArea());
        }
    }
}

abstract class Figura{
    public abstract double calcularArea();
}

class Triangulo extends Figura{

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

class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}

class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
