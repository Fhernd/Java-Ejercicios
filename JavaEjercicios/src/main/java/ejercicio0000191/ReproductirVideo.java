package ejercicio0000191;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * Ejercicio 191: Reproducir un archivo de vídeo con la clase MediaPlayer de
 * JavaFX.
 *
 * @author John Ortiz Ordoñez
 */
public class ReproductirVideo extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        final String NOMBRE_ARCHIVO = "video.mp4";
        File archivo = new File(NOMBRE_ARCHIVO);
        
        Media video = new Media(archivo.toURI().toString());
        MediaPlayer reproductor = new MediaPlayer(video);
        MediaView ventana = new MediaView(reproductor);
        reproductor.setAutoPlay(true);
        
        Group escenario = new Group();
        escenario.getChildren().add(ventana);
        Scene escena = new Scene(escenario, 500, 400);
        stage.setScene(escena);
        stage.setTitle("Reproducción Vídeo");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
