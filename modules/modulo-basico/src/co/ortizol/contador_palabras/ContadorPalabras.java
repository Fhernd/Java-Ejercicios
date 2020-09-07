package co.ortizol.contador_palabras;

public class ContadorPalabras {
	public static void main(String[] args) {
		if (args.length > 0 ) {
			int contador = 0;
			for(String arg : args) {
				System.out.printf("Posición: %d - Valor: %s\n", contador, args[contador]);
				++contador;
			}
		} else {
			System.out.println("No especificó argumentos.");
		}
	}
}