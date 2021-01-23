package ejercicio0000472;

/**
 * Ejercicio 472: Crear una clase para definir constantes relacionadas.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConstantesClase {

    public static void main(String[] args) {
        
        System.out.println(Color.NEGRO);    // 0
        System.out.println(Color.AZUL);    // 4
        
        System.out.println();
        
        int colorSeleccionado = Color.NEGRO;
        
        if (colorSeleccionado == Color.ROJO) {
            System.out.println("El color seleccionado es ROJO.");
        } else {
            System.out.println("El color seleccionado no es ROJO.");
        }
        
        System.out.println();
        
        colorSeleccionado = Color.ROJO;
        
        if (colorSeleccionado == Color.ROJO) {
            System.out.println("El color seleccionado es ROJO.");
        } else {
            System.out.println("El color seleccionado no es ROJO.");
        }
    }
}

final class Color {
    public static final int BLANCO = 0;
    public static final int NEGRO = 1;
    public static final int ROJO = 2;
    public static final int VERDE = 3;
    public static final int AZUL = 4;
}
