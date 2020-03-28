package ejercicio0000328;

import java.lang.reflect.Field;

/**
 * Ejercicio 328: Buscar un campo de una clase utilizando el método getField().
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaCampoClase {

    public static void main(String[] args) {
        Object fecha = new Fecha(2020, 3, 26);
        
        System.out.println("El valor para el campo `agnio` es: " + obtenerValorCampo(fecha, "agnio"));
        System.out.println("El valor para el campo `mes` es: " + obtenerValorCampo(fecha, "mes"));
        System.out.println("El valor para el campo `dia` es: " + obtenerValorCampo(fecha, "dia"));
    }
    
    static int obtenerValorCampo(Object objeto, String nombreCampo){
        try {
            Class<?> clase = objeto.getClass();
            Field campo = clase.getField(nombreCampo);
            
            return campo.getInt(objeto);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

class Fecha {

    public int agnio;
    public int mes;
    public int dia;

    public Fecha() {
    }

    public Fecha(int agnio, int mes, int dia) {
        this.agnio = agnio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAgnio() {
        return agnio;
    }

    public void setAgnio(int agnio) {
        this.agnio = agnio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
