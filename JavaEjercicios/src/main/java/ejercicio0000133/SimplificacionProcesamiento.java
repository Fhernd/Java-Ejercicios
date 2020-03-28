package ejercicio0000133;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 133: Simplificación de procesamiento con Streams.
 * 
 * @author John Ortiz Ordoñez
 */
public class SimplificacionProcesamiento {

    public static void main(String[] args) {
        
        Persona[] personas = {
            new Persona("Edward", 30),
            new Persona("Daniela", 25),
            new Persona("Oliva", 43),
            new Persona("Juan", 45), 
            new Persona("Julio", 53),
            new Persona("Alexander", 39),
            new Persona("Sandra", 35),
            new Persona("Germán", 33)
        };
        
        long sumaEdades = Arrays.stream(personas)
                .filter(p -> p.getEdad() > 35)
                .mapToInt(p -> p.getEdad()).sum();
        
        System.out.println("Resultado suma edades mayores a 35: " + sumaEdades);
        
        System.out.println("");
        
        List<Object> personasOrdenadas = Arrays.stream(personas)
                .sorted((persona1, persona2) -> persona1.getNombre().compareTo(persona2.getNombre())).map(persona -> persona.getNombre())
                .collect(Collectors.toList());
        
        for (Object persona : personasOrdenadas) {
            System.out.println(persona);
        }
    }
}

class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
