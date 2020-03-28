package ejercicio0000134;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 134: Hacer uso de las capacidades de paralelismo 
 * de streams.
 * 
 * @author John Ortiz Ordoñez
 */
public class ParalelismoStream {

    public static void main(String[] args) {
       
        List<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto("Mouse", 35000));
        productos.add(new Producto("Teclado", 150000));
        productos.add(new Producto("Monitor", 350000));
        productos.add(new Producto("Parlantes", 75000));
        productos.add(new Producto("Webcam", 80000));
        productos.add(new Producto("Kindle", 650000));
        productos.add(new Producto("Control juegos", 170000));
        productos.add(new Producto("Tablet", 1550000));
        productos.add(new Producto("Smartphone", 2700000));
        
        for (Object producto : productos.parallelStream()
                .filter(p -> p.getPrecio() >= 300000 && 
                        p.getPrecio() <= 2600000)
                .toArray()) {
            
            System.out.println(producto);
        }
    }
}

class Producto{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
}
