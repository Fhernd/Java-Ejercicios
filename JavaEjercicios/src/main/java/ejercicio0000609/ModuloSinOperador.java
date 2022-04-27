package ejercicio0000609;

/**
 * Ejercicio 609: Calcular el módulo de dos números sin usar el operador de residuo.
 *
 * @author: John Ortiz Ordoñez
 */
public class ModuloSinOperador {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(calcularModulo(a, b));   // 2

        System.out.println();

        a = 11;
        b = 8;
        System.out.println(calcularModulo(a, b));   // 3
    }

    public static int calcularModulo(int dividendo, int divisor) {
        int cociente = dividendo / divisor;

        return dividendo - (cociente * divisor);
    }
}
