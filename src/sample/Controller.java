package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.DBconnect.DBconnection;
import sample.QuestionSection.QuestionController;

import java.io.IOException;

public class Controller {

    @FXML
    private Button playbtn;

    @FXML
    private Button profilebtn;

    @FXML
    private Button leaderboardbtn;

    @FXML
    private Button aboutbtn;

    @FXML
    private Label profileName;

    @FXML
    private Label profileId;
    private DBconnection dbconnecting;
    public Controller() {
        dbconnecting = new DBconnection();
    }

    @FXML
    void about(MouseEvent event) {

    }

    @FXML
    void leaderboard(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("leaderboard/Leaderboard.fxml"));
        Parent clinic = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(clinic));
        stage.show();
    }

    @FXML
    void play(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionSection/QuestionView.fxml"));

        Parent clinic = null;
        try {
            clinic = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(clinic));
        QuestionController questionController = loader.getController();
        questionController.setDBconnection(dbconnecting);
        stage.show();
    }

    @FXML
    void profile(MouseEvent event) {

    }


}

