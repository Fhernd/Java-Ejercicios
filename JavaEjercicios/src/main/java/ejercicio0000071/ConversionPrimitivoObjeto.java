package ejercicio0000071;

import java.util.ArrayList;

/**
 * Ejercicio 71: Convertir tipos primitivos a tipos por referencia.
 * @author John Ortiz Ordoñez
 */
public class ConversionPrimitivoObjeto {
    public static void main(String[] args) {
        int numeroEntero = 42;
        
        Integer entero1 = new Integer(numeroEntero);
        Integer entero2 = Integer.valueOf(numeroEntero);
        Integer entero3 = numeroEntero;
        
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(numeroEntero);
        listaEnteros.add(64);
        listaEnteros.add(entero1);
        listaEnteros.add(entero2);
        listaEnteros.add(entero3);
        
        Double pi = Math.PI;
        Boolean llueve = true;
        Float e = (float) Math.E;
        Character caracter = 'E';
        
        // Conversión de Integer a int:
        int valorEntero32Bits = entero1.intValue();
        
        // Conversión de Double a double:
        double valorPi = pi.doubleValue();
    }
}
