package ejercicio0000616;

/**
 * Ejercicio 616: Substituir por otro carácter las coincidencias de un carácter sobre un texto.
 *
 * @author: John Ortiz Ordoñez
 */
public class SubstitucionCaracter {
    public static void main(String[] args) {
        System.out.println(substituirCaracteres("COlOmbia", 'O', 'o')); // Colombia
        System.out.println(substituirCaracteres("C0l0mbia", '0', 'o')); // Colombia
    }

    public static String substituirCaracteres(String texto, char caracter, char nuevoCaracter) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                texto = texto.replace(caracter, nuevoCaracter);
            }
        }

        return texto;
    }
}
