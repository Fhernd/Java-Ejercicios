package ejercicio0000330;

import java.lang.reflect.Field;

/**
 * Ejercicio 330: Acceder a los campos o métodos privados de una clase con Reflection API.
 *
 * @author John Ortiz Ordoñez
 */
public class AccesoCampoPrivado {

    public static void main(String[] args) {
        try {
            Computador computador = new Computador(1001, "MSi", 729);
            
            // System.out.println(computador.id); // Genera error
            
            Class<? extends Computador> clase = computador.getClass();
            
            Field[] campos = clase.getDeclaredFields();
            
            for (Field campo : campos) {
                campo.setAccessible(true);
                System.out.println(campo + " " + campo.get(computador));
                
                campo.setAccessible(false);
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
            e.printStackTrace();
        }
    }
}

class Computador {

    private int id;
    private String marca;
    private double precio;

    public Computador() {
    }

    public Computador(int id, String marca, double precio) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
