package ejercicio0000267;

import java.util.function.BiPredicate;

/**
 * Ejercicio 267: Operadores relacionales usando programación funcional.
 * 
 * @author John Ortiz Ordoñez
 */
public class OperadoresRelacionales {

    public static void main(String[] args) {
        
        BiPredicate<Integer, Integer> menorQue = (x, y) -> x < y;
        BiPredicate<Integer, Integer> menorOIgualQue = (x, y) -> x <= y;
        BiPredicate<Integer, Integer> mayorQue = (x, y) -> x > y;
        BiPredicate<Integer, Integer> mayorOIgualQue = (x, y) -> x >= y;
        BiPredicate<Integer, Integer> DiferenteDe = (x, y) -> x.intValue() != y.intValue();
        BiPredicate<Integer, Integer> igual = (x, y) -> x.intValue() == y.intValue();
        
        final Integer numero1 = 2;
        final Integer numero2 = 3;
        
        System.out.println(menorQue.test(numero1, numero2));
        System.out.println(menorOIgualQue.test(numero1, numero2));
        System.out.println(mayorQue.test(numero1, numero2));
        System.out.println(mayorOIgualQue.test(numero1, numero2));
        System.out.println(DiferenteDe.test(numero1, numero2));
        System.out.println(igual.test(numero1, numero2));
    }
}
