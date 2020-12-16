package ejercicio0000455;

/**
 * Ejercicio 455: Comprobar si una clase es subclase de otro clase con el 
 * operador instanceof.
 *
 * @author John Ortiz Ordoñez
 */
public class ClasePadre {

    public static void main(String[] args) {
        
        Gato tom = new Gato();
        System.out.println(tom instanceof Animal);  // true
        
        System.out.println();
        
        Hidrogeno h = new Hidrogeno();
        // System.out.println(h instanceof Animal);
        
        Animal animal = new Animal();
        
        System.out.println(animal instanceof Gato); // false
    }
}

class Animal {
    
}

class Gato extends Animal {
    
}

class Hidrogeno {
    
}
