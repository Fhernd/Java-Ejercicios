package ejercicio0000470;

/**
 * Ejercicio 470: Crear una interfaz funcional para las operaciones aritméticas 
 * básicas.
 * 
 * @author John Ortiz Ordoñez
 */
public class OperacionesAritmeticas {

    public static void main(String[] args) {
        
        OperacionAritmetica suma = (a, b) -> a + b;
        OperacionAritmetica resta = (a, b) -> a - b;
        OperacionAritmetica producto = (a, b) -> a * b;
        OperacionAritmetica division = (a, b) -> a / b;
        
        System.out.println(suma.operacion(2, 3));
        System.out.println(resta.operacion(2, 3));
        System.out.println(producto.operacion(2, 3));
        System.out.println(division.operacion(2, 3));
    }
}

interface OperacionAritmetica {
    double operacion(double a, double b);
}
