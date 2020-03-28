package ejercicio0000327;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Ejercicio 327: Obtener el listado de miembros de una clase arbitraria con Class.forName().
 * 
 * @author John Ortiz Ordoñez
 */
public class ListadoMiembrosClase {

    public static void main(String[] args) {
        String nombreClase = "ejercicio0000327.Computador";
        
        try{
            Class<?> clase = Class.forName(nombreClase);
            
            Constructor<?>[] constructores = clase.getConstructors();
            imprimirMiembros("Constructores", constructores);
            
            System.out.println();
            
            Method[] metodos = clase.getMethods();
            imprimirMiembros("Métodos", metodos);
            
            System.out.println();
            
            Field[] campos = clase.getFields();
            imprimirMiembros("Campos", campos);
        } catch(ClassNotFoundException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
    static void imprimirMiembros(String nombreMiembro, Object[] miembros){
        System.out.println("Listado de " + nombreMiembro + ": ");
        
        for (Object miembro : miembros) {
            System.out.println(miembro.toString());
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
