package ejercicio0000052;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * Ejercicio 52: Procesar un archivo CSV con la librería Apache Commons CSV.
 *
 * @author John Ortiz Ordoñez
 */
public class LecturaCSV {

    private static final String RUTA_ARCHIVO = "datos.csv";

    public static void main(String[] args) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_ARCHIVO));

            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);

            for (CSVRecord registro : parser) {
                if (registro.getRecordNumber() != 1) {
                    String id = registro.get(0);
                    String nombre = registro.get(1);
                    String email = registro.get(2);

                    System.out.println("ID: " + id);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Email: " + email);
                    System.out.println("");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LecturaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
