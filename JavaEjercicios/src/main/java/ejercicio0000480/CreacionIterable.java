package ejercicio0000480;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Ejercicio 480: Usar una clase para hacer de un conjunto de objetos iterable.
 *
 * @author John Ortiz Ordoñez
 */
public class CreacionIterable {

    public static void main(String[] args) {
        Almacen almacenComputadores = new Almacen();
        
        almacenComputadores.agregarComputador(new Computador(1001, "Clone", "Intel Core i7", 128, 8000));
        almacenComputadores.agregarComputador(new Computador(1002, "Apple", "Intel Core i5", 16, 720));
        almacenComputadores.agregarComputador(new Computador(1003, "MSi", "Intel Core i7", 32, 1024));
        almacenComputadores.agregarComputador(new Computador(1004, "Asus", "Intel Core i7", 16, 500));
        
        // Iteración de un objeto `Almacen` con un ciclo for mejorado:
        for (Computador c : almacenComputadores) {
            System.out.println(c);
        }
        
        System.out.println();
        
        // Iteración de un objeto `Almacen` con una expresión lambda:
        almacenComputadores.forEach(c -> System.out.println(c));
    }
}

class Almacen implements Iterable<Computador> {
    
    private Map<Integer, Computador> computadores;

    public Almacen() {
        computadores = new HashMap<>();
    }
    
    public void agregarComputador(Computador computador) {
        computadores.put(computador.getId(), computador);
    }

    @Override
    public Iterator<Computador> iterator() {
        return computadores.values().iterator();
    }
}

class Computador {

    private int id;
    private String marca;
    private String cpu;
    private int ram;
    private int ssd;

    public Computador() {
    }

    public Computador(String marca, String cpu, int ram, int ssd) {
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    public Computador(int id, String marca, String cpu, int ram, int ssd) {
        this.id = id;
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computador{" + "id=" + id + ", marca=" + marca + ", cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + '}';
    }
}
