package ejercicio0000480;

import java.util.Iterator;

/**
 * Ejercicio 480: Usar una clase para hacer de un conjunto de objetos iterable.
 *
 * @author John Ortiz Ordoñez
 */
public class CreacionIterable {

    public static void main(String[] args) {

    }
}

class Almacen implements Iterable<Computador> {

    @Override
    public Iterator<Computador> iterator() {
        
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
}
