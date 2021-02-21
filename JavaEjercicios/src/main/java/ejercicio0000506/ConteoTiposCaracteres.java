package ejercicio0000506;

/**
 * Ejercicio 506: Definir una función para contar letras, números, espacios y otros caracteres de un texto.
 *
 * @author John Ortiz Ordoñez
 */
public class ConteoTiposCaracteres {

    public static void main(String[] args) {
        
        String texto = "¡Java v.8.0 es génial!";
        Resultado resultado = contarTiposCaracteres(texto);
        
        System.out.println("Cantidad de letras en el texto: " + texto.length());
        System.out.println("Cantidad de letras: " + resultado.contadorLetras); // 13
        System.out.println("Cantidad de números: " + resultado.contadorNumeros); // 2
        System.out.println("Cantidad de espacios: " + resultado.contadorEspacios);  // 3
        System.out.println("Cantidad de otros caracteres: " + resultado.contadorOtrosCaracteres); // 4
    }
    
    public static Resultado contarTiposCaracteres(String texto) {
        int contadorLetras = 0;
        int contadorNumeros = 0;
        int contadorEspacios = 0;
        int contadorOtrosCaracteres = 0;
        
        char[] caracteres = texto.toCharArray();
        
        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isLetter(caracteres[i])) {
                ++contadorLetras;
            } else if (Character.isDigit(caracteres[i])) {
                ++contadorNumeros;
            } else if (Character.isSpaceChar(caracteres[i])) {
                ++contadorEspacios;
            } else {
                ++contadorOtrosCaracteres;
            }
        }
        
        Resultado resultado = new Resultado();
        resultado.contadorLetras = contadorLetras;
        resultado.contadorNumeros = contadorNumeros;
        resultado.contadorEspacios = contadorEspacios;
        resultado.contadorOtrosCaracteres = contadorOtrosCaracteres;
        
        return resultado;
    }
}

class Resultado {
    public int contadorLetras;
    public int contadorNumeros;
    public int contadorEspacios;
    public int contadorOtrosCaracteres;
}
