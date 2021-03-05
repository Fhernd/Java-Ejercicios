package ejercicio0000518;

/**
 * Ejercicio 518: Convertir una cantidad de segundos en horas, minutos, y segundos.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionSegundos {

    public static void main(String[] args) {
        
        int segundos = 83237;
        int[] resultado = convertirTiempo(segundos);
        
        System.out.println("Horas: " + resultado[0]);
        System.out.println("Minutos: " + resultado[1]);
        System.out.println("Segundos: " + resultado[2]);
    }
    
    public static int[] convertirTiempo(int segundos) {
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        
        int[] tiempo = {horas, minutos, segundos};
        
        return tiempo;
    }
}
