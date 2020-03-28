package ejercicio0000080;

/**
 * Ejercicio 80: Pluralizar una cadena de caracteres.
 * 
 * @author John Ortiz Ordoñez
 */
public class PluralizacionCadenas {
    public static void main(String[] args) {
        mostrarReporte(20);
    }
    
    public static void mostrarReporte(int numeroLineas){
        System.out.println("El archivo tiene " + numeroLineas + (numeroLineas > 1 ? " líneas." : " línea."));
    }
}
