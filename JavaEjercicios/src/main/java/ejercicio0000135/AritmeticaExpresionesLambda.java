package ejercicio0000135;

/**
 * Ejercicio 135: Aritmética con expresiones lambda.
 * 
 * @author John Ortiz Ordoñez
 */
public class AritmeticaExpresionesLambda {

    public static void main(String[] args) {
        
        OperacionAritmetica suma = (a, b) -> a + b;
        OperacionAritmetica resta = (a, b) -> a - b;
        OperacionAritmetica multiplicacion = (a, b) -> a * b;
        OperacionAritmetica division = (a, b) -> a / b;
        
        System.out.println("Suma: " + suma.operacion(5, 3));
        System.out.println("Resta: " + resta.operacion(5, 3));
        System.out.println("Multiplicación: " + multiplicacion.operacion(5, 3));
        System.out.println("División: " + division.operacion(5, 3));
    }
}

interface OperacionAritmetica{
    double operacion(double operando1, double operando2);
}
