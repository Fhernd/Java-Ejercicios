package ejercicio0000301;

/**
 * Representa una calculadora y varias de sus operaciones aritméticas elementales.
 * 
 * @author John Ortiz Ordoñez
 */
public class Calculadora {

    /**
     * Representa la constante matemática de pi.
     */
    private static final double PI = 3.14159265358979;
    /**
     * Representa la constante matemática de Euler.
     */
    private static final double E = 2.718281828459;

    /**
     * Crea una instancia de la clase Calculadora.
     */
    public Calculadora() {
    }
    
    /**
     * Suma dos números.
     * @param a Primer operando de la suma.
     * @param b Segundo operando de la suma.
     * @return Suma de los dos números pasados como argumentos.
     */
    public double sumar(double a, double b){
        return a + b;
    }
    
    /**
     * Resta dos números.
     * @param a Primer operando de la resta.
     * @param b Segundo operando de la resta.
     * @return Resta los dos números pasados como argumentos.
     */
    public double restar(double a, double b){
        return a - b;
    }
    
    /**
     * Producto de dos números.
     * @param a Primer operando del producto.
     * @param b Segundo operando del producto.
     * @return Producto de los dos números pasados como argumentos.
     */
    public double multiplicar(double a, double b){
        return a * b;
    }
    
    /**
     * Divide dos números.
     * @param a Dividendo.
     * @param b Divisor.
     * @return División de los dos números pasados como argumentos.
     */
    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intento de división entre cero.");
        }
    }
    
    /**
     * Elevan un número a una potencia dada.
     * @param base Base a elevar.
     * @param exponente Exponente de la potencia.
     * @return Potencia de un número.
     */
    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
    
    /**
     * Calcula el valor absoluto de un número.
     * @param valor Número a calcular su absoluto.
     * @return Valor absoluto.
     */
    public double valorAbsoluto(double valor){
        return Math.abs(valor);
    }
}
