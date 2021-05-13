package sample.QuestionSection;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import sample.DBconnect.DBconnection;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionController {

    @FXML
    private AnchorPane AnchorShde;
    @FXML
    private Button btnNext1;

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
    private ArrayList<QuestionAndAnswer> Question ;
    private ArrayList<Button> buttons ;
    int AsuultOlogch = 0;
    int NiitHariult = 0;

    public QuestionController() {
        Question = new ArrayList<>();
        buttons = new ArrayList<>();
        buttons.add(btnChoice1);
        buttons.add(btnChoice2);
        buttons.add(btnChoice3);
        buttons.add(btnChoice4);
    }
    public void setDBconnection(DBconnection db){
        this.dbconnection = db;
        changeQuestion();
    }
    public void changeQuestion(){
        Question = dbconnection.getQuestions();
        lblQuestion.setText(Question.get(AsuultOlogch).getQuestions());
        btnChoice1.setText(Question.get(AsuultOlogch).getAnswer());
        btnChoice2.setText(Question.get(AsuultOlogch).getWrong1());
        btnChoice3.setText(Question.get(AsuultOlogch).getWrong2());
        btnChoice4.setText(Question.get(AsuultOlogch).getWrong3());
    }
    @FXML
    void Choice1(ActionEvent event)
    {
        if (((Button)event.getSource()).getText().equals(Question.get(AsuultOlogch).getAnswer()))
            this.NiitHariult++;

        this.AsuultOlogch++;

        lblQuestion.setText(Question.get(AsuultOlogch).getQuestions());

        btnChoice1.setText(Question.get(AsuultOlogch).getAnswer());
        btnChoice2.setText(Question.get(AsuultOlogch).getWrong1());
        btnChoice3.setText(Question.get(AsuultOlogch).getWrong2());
        btnChoice4.setText(Question.get(AsuultOlogch).getWrong3());
        if (AsuultOlogch==4)
        {
            btnChoice1.setVisible(false);
            btnChoice2.setVisible(false);
            btnChoice3.setVisible(false);
            btnChoice4.setVisible(false);
            lblQuestion.setText("Ta niit:" + NiitHariult + " Amjiltai hariulsan bn");
            System.out.println(lblQuestion.getText());
        }
    }



    @FXML
    void Exit(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

}
