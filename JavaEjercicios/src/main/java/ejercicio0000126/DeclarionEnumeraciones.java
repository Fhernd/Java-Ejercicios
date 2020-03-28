package ejercicio0000126;

/**
 * Ejercicio 126: Declaración de enumeraciones.
 * 
 * @author John Ortiz Ordoñez
 */
public class DeclarionEnumeraciones {

    public static void main(String[] args) {
        
        DiasSemana diaSemana = DiasSemana.LUNES;
        
        switch(diaSemana){
            case LUNES:
                System.out.println("El día seleccionado es lunes.");
                break;
            case MARTES:
                System.out.println("El día seleccionado es martes.");
                break;
            case MIERCOLES:
                System.out.println("El día seleccionado es miércoles.");
                break;
            case JUEVES:
                System.out.println("El día seleccionado es jueves.");
                break;
            case VIERNES:
                System.out.println("El día seleccionado es viernes.");
                break;
            case SABADO:
                System.out.println("El día seleccionado es sábado.");
                break;
            case DOMINGO:
                System.out.println("El día seleccionado es domingo.");
                break;
        }
        
        System.out.println("Valores disponibles en la enumeración DiasSemana");
        
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println(dia);
        }
    }
}

enum DiasSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

enum PuntosCardinales {
    NORTE, ORIENTE, SUR, OCCIDENTE
}
