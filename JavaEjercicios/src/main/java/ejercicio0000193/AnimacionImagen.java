package ejercicio0000193;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Ejercicio 193: Aplicar una animación de transición sobre una imagen usando
 * JavaFX.
 *
 * @author John Ortiz Ordoñez
 */
public class AnimacionImagen extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        // Carga de la imagen:
        final String NOMBRE_IMAGEN = "java-logo.png";
        File archivoImagen = new File(NOMBRE_IMAGEN);
        InputStream is = new FileInputStream(archivoImagen);
        ImageView vista = new ImageView();
        Image imagen = new Image(is);
        vista.setImage(imagen);
        
        // Configuración de la animación de transición:
        FadeTransition ft = new FadeTransition();
        ft.setNode(vista);
        ft.setDuration(new Duration(2000));
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(5);
        ft.setAutoReverse(true);
        
        // Evento de inicio de animación:
        vista.setOnMouseClicked(evt -> ft.play());
        
        // Configuración de escena:
        Group grupoPrincipal = new Group();
        grupoPrincipal.getChildren().add(vista);
        Scene escena = new Scene(grupoPrincipal, imagen.getWidth(), imagen.getHeight());
        stage.setTitle("Animación de Transición sobre una Imagen");
        stage.setScene(escena);
        stage.show();
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }
}
