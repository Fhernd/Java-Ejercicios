package ejercicio0000637;

/**
 * Ejercicio 637: Comprobar si un dato se encuentra a la derecha o izquierda de otro dato.
 *
 * @author: John Ortiz Ordoñez
 */
public class BusquedaDatoSiguiente {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 7, 11, 13};

        System.out.println(comprobarExistencia(numeros, 2, 3)); // true
        System.out.println(comprobarExistencia(numeros, 3, 7)); // false
        System.out.println(comprobarExistencia(numeros, 13, 11)); // true
    }

    public static boolean comprobarExistencia(int[] numeros, int numero, int otroNumero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                if (i > 0 && i < numeros.length - 1 &&  (numeros[i - 1] == otroNumero || numeros[i + 1] == otroNumero)) {
                    return true;
                }

                if (i == 0 && numeros[i + 1] == otroNumero) {
                    return true;
                }

                if (i == (numeros.length - 1) && numeros[i - 1] == otroNumero) {
                    return true;
                }
            }
        }

        return false;
    }
}
