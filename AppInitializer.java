import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent container = FXMLLoader.load(this.getClass().getResource("view/ListViewForm2.fxml"));
        var scene = new Scene(container);
        primaryStage.setScene(scene);
        primaryStage.setTitle("List view, combo box and table demo");
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}
