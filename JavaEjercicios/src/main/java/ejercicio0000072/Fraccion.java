package ejercicio0000072;

/**
 * Ejercicio 72: Crear una clase que represente una fracción.
 * 
 * @author John Ortiz Ordoñez
 */
public class Fraccion {
    private double numerador;
    private double denominador;

    public Fraccion() {
    }

    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }
    
    public Fraccion sumar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion();
        
        double nuevoNumerador = this.numerador * otraFraccion.getDenominador() + this.denominador * otraFraccion.getNumerador();
        
        double nuevoDenominador = this.denominador * otraFraccion.getDenominador();
        
        nuevaFraccion.setNumerador(nuevoNumerador);
        nuevaFraccion.setDenominador(nuevoDenominador);
        
        return nuevaFraccion;
    }
    
    public Fraccion restar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion();
        
        double nuevoNumerador = this.numerador * otraFraccion.getDenominador() - this.denominador * otraFraccion.getNumerador();
        
        double nuevoDenominador = this.denominador * otraFraccion.getDenominador();
        
        nuevaFraccion.setNumerador(nuevoNumerador);
        nuevaFraccion.setDenominador(nuevoDenominador);
        
        return nuevaFraccion;
    }
    
    public Fraccion multiplicar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion();
        
        double nuevoNumerador = this.numerador * otraFraccion.getNumerador();
        
        double nuevoDenominador = this.denominador * otraFraccion.getDenominador();
        
        nuevaFraccion.setNumerador(nuevoNumerador);
        nuevaFraccion.setDenominador(nuevoDenominador);
        
        return nuevaFraccion;
    }
    
    public Fraccion dividir(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion();
        
        double nuevoNumerador = this.numerador * otraFraccion.getDenominador();
        
        double nuevoDenominador = this.denominador * otraFraccion.getNumerador();
        
        nuevaFraccion.setNumerador(nuevoNumerador);
        nuevaFraccion.setDenominador(nuevoDenominador);
        
        return nuevaFraccion;
    }

    @Override
    public String toString() {
        return String.format("%.2f/%.2f", numerador, denominador);
    }
    
    
    
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);
        
        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }
}
