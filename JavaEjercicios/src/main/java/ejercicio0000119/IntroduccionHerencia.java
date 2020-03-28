package ejercicio0000119;

/**
 * Ejercicio 119: Introducción a la herencia con la palabra clave 
 * extends.
 * 
 * @author John Ortiz Ordoñez
 */
public class IntroduccionHerencia {

    public static void main(String[] args) {
        
        Persona edward = new Persona("Edward Ortiz", 32);
    }
}

class Persona{
    private String nombreCompleto;
    private int edad;

    public Persona() {
    }

    public Persona(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}

class Empleado extends Persona{
    private double salarioBase;

    public Empleado() {
    }

    public Empleado(double salarioBase, String nombreCompleto, int edad) {
        super(nombreCompleto, edad);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

class EmpleadoPorNomina extends Empleado{
    
}

class EmpleadoPorComision extends Empleado {
    
}
