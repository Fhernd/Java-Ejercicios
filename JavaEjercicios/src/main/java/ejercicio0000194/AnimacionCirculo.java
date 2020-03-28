package ejercicio0000194;

import javafx.animation.StrokeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Ejercicio 194: Aplicar una animación a una figura círculo usando JavaFX.
 *
 * @author John Ortiz Ordoñez
 */
public class AnimacionCirculo extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Stop[] alternacionesAzul = new Stop[]{
            new Stop(0, Color.BLUE),
            new Stop(1, Color.DARKBLUE)
        };
        
        // Gradiente de la figura:
        LinearGradient lg = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, alternacionesAzul);
        
        Group grupoPrincipal = new Group();
        Scene escena = new Scene(grupoPrincipal, 300, 300, lg);
        
        // Creación del círculo que representa un sol:
        Circle sol = new Circle();
        sol.centerXProperty().bind(escena.widthProperty().divide(2));
        sol.centerYProperty().bind(escena.heightProperty().divide(2));
        sol.setRadius(100);
        sol.setFill(Color.YELLOW);
        sol.setStroke(Color.YELLOW);
        sol.setStrokeWidth(7);
        
        grupoPrincipal.getChildren().add(sol);
        
        // Creación de la animación:
        StrokeTransition st = new StrokeTransition();
        st.setShape(sol);
        st.setDuration(new Duration(2000));
        st.setToValue(Color.ORANGE);
        st.setCycleCount(Timeline.INDEFINITE);
        st.setAutoReverse(true);
        st.play();
        
        stage.setTitle("Animación Sol");
        stage.setScene(escena);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
