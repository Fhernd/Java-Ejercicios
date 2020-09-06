package ejercicio0000357;

/**
 * 
 *
 * @author John Ortiz Ordoñez
 */
public class CalculadoraEstandar implements Calculadora{

    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }
}
