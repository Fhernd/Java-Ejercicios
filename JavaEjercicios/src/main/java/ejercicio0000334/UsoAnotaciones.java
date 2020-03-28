package ejercicio0000334;

/**
 * Ejercicio 334: Aplicar una anotación (atributo) a una clase.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoAnotaciones {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(2, 3);
        Fraccion fraccion2 = new Fraccion(2, 3);
        
        System.out.println(fraccion1.equals(fraccion2));
        
    }
}

class Fraccion extends Object{
    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    @Override
    public boolean equals(Object otraFraccion){
        Fraccion fraccion = (Fraccion) otraFraccion;
        return this.numerador == fraccion.getNumerador() && this.denominador == fraccion.getDenominador();
    }
    
    @Override
    public String toString(){
        return "";
    }
}
