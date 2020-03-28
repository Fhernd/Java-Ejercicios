package ejercicio0000291;

import org.json.JSONObject;

/**
 * Ejercicio 291: Ejemplo de uso básico de la librería org.json para generar JSON.
 * 
 * @author John Ortiz Ordoñez
 */
public class GeneracionJsonConOrgJson {

    public static void main(String[] args) {
        
        JSONObject json = new JSONObject();
        
        json.put("id", 1001);
        json.put("nombre", "John Ortiz Ordoñez");
        json.put("correo", "john@mail.co");
        json.put("profesion", "Programador");
        
        String cadenaJson = json.toString();
        
        System.out.println(cadenaJson);
    }
}
