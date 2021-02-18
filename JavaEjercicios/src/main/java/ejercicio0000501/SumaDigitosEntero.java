package ejercicio0000501;

/**
 * Ejercicio 501: Definir una función para sumar los dígitos de un número entero positivo (usar ciclo while).
 *
 * @author John Ortiz Ordoñez
 */
public class SumaDigitosEntero {

    public static void main(String[] args) {
        int numero = 12345;
        
        int suma = sumarDigitosEntero(numero);
        System.out.println(suma);   // 15
    }

    public static int sumarDigitosEntero(int numero) {
        int suma = 0;

        while(numero != 0) {
            suma += numero % 10;
            
            numero /= 10;
        }
        
        return suma;
    }
}
