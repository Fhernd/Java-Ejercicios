package ejercicio0000272;

/**
 * Ejercicio 272: Crear una interfaz funcional (Functional Interface) 
 * personalizada.
 * 
 * @author John Ortiz Ordoñez
 */
public class Calculadora {

    public static void main(String[] args) {
        
        CalculadoraEnteros sumar = (a, b) -> a + b;
        CalculadoraEnteros restar = (a, b) -> a - b;
        CalculadoraEnteros multiplicar = (a, b) -> a * b;
        CalculadoraEnteros dividir = (a, b) -> b != 0 ? a / b : 0;
        
        final int numero1 = 2;
        final int numero2 = 3;
        
        System.out.println(sumar.calcular(numero1, numero2));
        System.out.println(restar.calcular(numero1, numero2));
        System.out.println(multiplicar.calcular(numero1, numero2));
        System.out.println(dividir.calcular(numero1, numero2));
    }
}

@FunctionalInterface
interface CalculadoraEnteros {
    int calcular(int x, int y);
}