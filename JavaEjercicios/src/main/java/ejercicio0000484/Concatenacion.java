package ejercicio0000484;

/**
 * Ejercicio 484: Usar la clase StringBuilder para concatenar cadenas de 
 * caracteres (texto).
 *
 * @author John Ortiz Ordoñez
 */
public class Concatenacion {

    public static void main(String[] args) {
        
        StringBuilder nombreCompleto = new StringBuilder("Irlesa ");
        nombreCompleto.append("Indira ");
        nombreCompleto.append("Ocampo ");
        nombreCompleto.append("Romero");
        
        String resultado = nombreCompleto.toString();
        
        System.out.println(resultado);
        
        System.out.println();
        
        // vs String:
        String fullName = "Irlesa ";    // 1. "Irlesa"
        fullName += "Indira "; // 2. "Irlesa Indira "
        fullName += "Ocampo "; // 3. "Irlesa Indira Ocampo "
        fullName += "Romero";  // 4. "Irlesa Indira Ocampo Romero"
        
        System.out.println(fullName);
    }
}
