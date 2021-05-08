package add_profile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Add_profile extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Add_profile.fxml"));
        primaryStage.setTitle(" A&M's QUIZ GAME APP");
        primaryStage.setScene(new Scene(root, 700, 300));
        primaryStage.show();
    }
    public static void Add_profile(String[] args) {
        launch(args);
    }
}
