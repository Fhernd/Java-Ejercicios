package ejercicio0000285;

import java.time.LocalDate;

/**
 * Ejercicio 285: Generar JSON de forma manual (i.e. sin uso de ninguna librería).
 * 
 * @author John Ortiz Ordoñez
 */
public class GeneracionJsonManual {
    
    /*
    {
        "agnio": 2020,
        "mes": 3,
        "dia": 17
    }
    */
    
    private static final String APERTURA = "{";
    private static final String CIERRE = "}";
    
    public String convertirAJson(LocalDate fechaActual){
        StringBuilder json = new StringBuilder();
        json.append(APERTURA);
        json.append("\n");
        
        json.append(crearPropiedadJson("agnio", fechaActual.getYear()));
        json.append(crearPropiedadJson("mes", fechaActual.getMonth()));
        json.append(crearPropiedadJson("dia", fechaActual.getDayOfMonth()));
        
        json.append(CIERRE);
        json.append("\n");
        
        return json.toString();
    }
    
    private String crearPropiedadJson(String nombre, Object valor){
        return String.format("\"%s\": \"%s\",\n", nombre, valor);
    }
    
    public static void main(String[] args) {
        GeneracionJsonManual objeto = new GeneracionJsonManual();
        
        LocalDate ahora = LocalDate.now();
        
        String json = objeto.convertirAJson(ahora);
        
        System.out.println(json);
    }
}
