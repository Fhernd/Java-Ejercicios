package ejercicio0000086;

/**
 * Ejercicio 86: Realizar operaciones aritméticas básicas con números 
 * complejos.
 * 
 * @author John Ortiz Ordoñez
 */
public class Complejo {
    private double real;
    private double imaginaria;

    public Complejo() {
    }

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }
    
    public Complejo sumar(Complejo otroComplejo){
        Complejo complejo = new Complejo();
        
        double nuevoReal = this.real + otroComplejo.getReal();
        double nuevoImaginaria = this.imaginaria + otroComplejo.getImaginaria();
        
        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevoImaginaria);
        
        return complejo;
    }
    
    public Complejo restar(Complejo otroComplejo){
        Complejo complejo = new Complejo();
        
        double nuevoReal = this.real - otroComplejo.getReal();
        double nuevoImaginaria = this.imaginaria - otroComplejo.getImaginaria();
        
        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevoImaginaria);
        
        return complejo;
    }
    
    public Complejo multiplicar(Complejo otroComplejo){
        Complejo complejo = new Complejo();
        
        double nuevoReal = this.real * otroComplejo.getReal() - this.getImaginaria() * otroComplejo.getImaginaria();
        
        double nuevaImaganaria = this.real * otroComplejo.getImaginaria() + this.imaginaria * otroComplejo.getReal();
        
        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevaImaganaria);
        
        return complejo;
    }
    
    public Complejo dividir(Complejo otroComplejo){
        Complejo complejo = new Complejo();
        
        double nuevoReal = (this.real * otroComplejo.getReal() + this.imaginaria * otroComplejo.getImaginaria()) / (otroComplejo.getReal() * otroComplejo.getReal() + otroComplejo.getImaginaria() * otroComplejo.getImaginaria());
        
        double nuevaImaginaria = (this.imaginaria * otroComplejo.getReal() - this.real * otroComplejo.getImaginaria()) / (otroComplejo.getReal() * otroComplejo.getReal() + otroComplejo.getImaginaria() * otroComplejo.getImaginaria());
        
        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevaImaginaria);
        
        return complejo;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2fj)", real, imaginaria);
    }
    
    
    
    public static void main(String[] args) {
        Complejo c1 = new Complejo(2, 3);
        Complejo c2 = new Complejo(-3, 5);
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("Suma: " + c1.sumar(c2));
        System.out.println("Resta: " + c1.restar(c2));
        System.out.println("Multiplicación: " + c1.multiplicar(c2));
        System.out.println("División: " + c1.dividir(c2));
    }
}
