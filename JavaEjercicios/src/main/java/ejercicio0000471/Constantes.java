package ejercicio0000471;

/**
 * Ejercicio 471: Definición de una enumeración para la declaración de constantes 
 * relacionadas.
 * 
 * @author John Ortiz Ordoñez
 */
public class Constantes {

    public static void main(String[] args) {
        
        Color colorSeleccionado = Color.NEGRO;
        
        System.out.println(colorSeleccionado.name());   // NEGRO
        System.out.println(colorSeleccionado.ordinal()); // 1
        System.out.println(colorSeleccionado.toString());   // "NEGRO"
        
        System.out.println();
        
        if (colorSeleccionado == Color.ROJO) {
            System.out.println("La constante de color es igual a ROJO.");
        } else {
            System.out.println("La constante de color no es igual a ROJO.");
        }
        
        System.out.println();
        
        if (colorSeleccionado == Color.NEGRO) {
            System.out.println("La constante de color es igual a NEGRO.");
        } else {
            System.out.println("La constante de color no es igual a NEGRO.");
        }
    }
}

enum Color {
    BLANCO,
    NEGRO,
    ROJO,
    VERDE,
    AZUL
}
