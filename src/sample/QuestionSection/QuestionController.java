package sample.QuestionSection;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import sample.DBconnect.DBconnection;

public class QuestionController {

    @FXML
    private AnchorPane AnchorShde;

    @FXML
    private Label lblQuestion;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnChoice1;

    @FXML
    private Button btnChoice2;

    @FXML
    private Button btnChoice3;

    @FXML
    private Button btnChoice4;
    private DBconnection dbconnection;
    private String[]  Question ;
    static int AsuultOlogch = 0;

    public QuestionController() {
//        txtField.setText("how old are you?");
        System.out.println("QUESTIONCONTROLLER");
    }
    public void setDBconnection(DBconnection db){
        this.dbconnection = db;
        changeQuestion();
    }
    public void changeQuestion(){
        Question = dbconnection.getQuestions();
        lblQuestion.setText(Question[AsuultOlogch]);
    }
    @FXML
    void Choice1(ActionEvent event) {

    }

    @FXML
    void Choice2(ActionEvent event) {

    }

    @FXML
    void Choice3(ActionEvent event) {

    }

    @FXML
    void Choice4(ActionEvent event) {

    }

    @FXML
    void Exit(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

}
