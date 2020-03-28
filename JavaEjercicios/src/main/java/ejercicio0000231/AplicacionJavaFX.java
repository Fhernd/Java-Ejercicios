package ejercicio0000231;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Ejercicio 231: Crear una aplicación con interfaz gráfica de usuario usando 
 * JavaFX.
 * 
 * @author John Ortiz Ordoñez
 */
public class AplicacionJavaFX extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Aplicación JavaFX");
        
        Button btnSaludar = new Button("Saludar");
        
        btnSaludar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Saludo");
                alerta.setContentText("¡Hola desde JavaFX!");
                
                alerta.show();
            }
        });
        
        StackPane stack = new StackPane();
        stack.getChildren().add(btnSaludar);
        stage.setScene(new Scene(stack, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        
        launch(args);
    }
}
