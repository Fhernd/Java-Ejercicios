package ejercicio0000329;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Ejercicio 329: Invocar un método de una clase usando la API de reflexión.
 * 
 * @author John Ortiz Ordoñez
 */
public class InvocacionMetodo {

    public static void main(String[] args) {
        try {
            Class<?> clase = Clase.class; // Class.forName("ejercicio0000329.Clase");3
            
            Class<?>[] tipoArgumentos = {int.class, String.class};
            
            Method procesar = clase.getMethod("procesar", tipoArgumentos);
            
            Object[] argumentos = {5, "Java es tremendo"};
            
            procesar.invoke(new Clase(), argumentos);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class Clase {
    public void procesar(int entero, String cadena){
        System.out.println("Entero: " + entero);
        System.out.println("Cadena: " + cadena);
    }
    
    public void procesar(int entero){        
        System.out.println("Entero: " + entero);
    }
}
