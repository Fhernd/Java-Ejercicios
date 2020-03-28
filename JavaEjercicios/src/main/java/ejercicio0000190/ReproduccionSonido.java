package ejercicio0000190;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Ejercicio 190: Reproducir un archivo de audio MP3 con MediaPlayer de 
 * JavaFX.
 * 
 * @author John Ortiz Ordoñez
 */
public class ReproduccionSonido {
    public static void main(String[] args) {
        
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        
        final String NOMBRE_ARCHIVO = "audio.mp3";
        File archivo = new File(NOMBRE_ARCHIVO);
        
        Media audio = new Media(archivo.toURI().toString());
        
        MediaPlayer reproductor = new MediaPlayer(audio);
        
        reproductor.play();
    }
}
