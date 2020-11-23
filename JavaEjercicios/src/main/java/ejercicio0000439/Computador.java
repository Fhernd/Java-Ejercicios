package ejercicio0000439;

/**
 * Ejercicio 439: Crear una clase y especificar sus miembros públicos y 
 * privados.
 *
 * @author John Ortiz Ordoñez
 */

public class Computador {
    private int id;
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;

    public Computador() {
    }

    public Computador(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public Computador(int id, String marca, String procesador, int ram, int almacenamiento) {
        this.id = id;
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
