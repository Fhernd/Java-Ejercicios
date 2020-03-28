package ejercicio0000120;

import java.util.Random;

/**
 * Ejercicio 120: Uso método getClass de Object.
 * 
 * @author John Ortiz Ordoñez
 */
public class MetodogetClass {

    public static void main(String[] args) {
        
        String nombre = "Edward Ortiz";
        
        System.out.println("\nClase de la variable nombre: " + nombre.getClass());
        
        Computador computador = new Computador("Apple", 32);
        
        System.out.println("\nClase de la variable computador: " + computador.getClass());
        
        Random aleatorio = new Random();
        System.out.println("\nClase la variable aleatorio: " + aleatorio.getClass());
    }
}


class Computador {
    private String marca;
    private int ram;

    public Computador(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
}
