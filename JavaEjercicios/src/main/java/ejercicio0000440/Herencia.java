package ejercicio0000440;

/**
 * Ejercicio 440: Crear una jerarquía de herencia y reutilizar código.
 *
 * @author John Ortiz Ordoñez
 */
public class Herencia {

    public static void main(String[] args) {
        
        Camion camion = new Camion(3.5, 1001, "Ford", "2019");
        System.out.println(camion.getId());
        System.out.println(camion.getMarca());
        System.out.println(camion.getModelo());
        System.out.println(camion.getCapacidad());
    }
}

class Vehiculo {
    private int id;
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Camion extends Vehiculo {
    private double capacidad;

    public Camion() {
    }

    public Camion(double capacidad, int id, String marca, String modelo) {
        super(id, marca, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
