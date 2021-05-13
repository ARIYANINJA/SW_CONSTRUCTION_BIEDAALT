package sample.DBconnect;

import sample.QuestionSection.QuestionAndAnswer;

import java.sql.*;
import java.util.ArrayList;

public class DBconnection
{
        private final String url = "jdbc:mysql://localhost:3306/quizapp";
        private final String username = "root";
        private final String password = "Csglobal328!";
        private  Connection connection;
        private ResultSet result;
        private Statement statement;
        private ArrayList<QuestionAndAnswer> list;
    public DBconnection() {
        try {
            this.connection = DriverManager.getConnection(this.url , this.username, this.password);
            list = new ArrayList<>();

        } catch (SQLException e) {
            System.out.println("daheck"+e);
            e.printStackTrace();
        }
    }

    public ArrayList<QuestionAndAnswer> getQuestions(){
        String[] Questions = new String[3];
        String sql = "SELECT * FROM asuult";
        try {
            statement = this.connection.createStatement();
            result = statement.executeQuery(sql);
                int i=0;
                while(result.next()){
                    QuestionAndAnswer questionAndAnswer = new QuestionAndAnswer(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
                    list.add(questionAndAnswer);
                }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("sql select hiij bolsongui!");
        }
      return list;
    }


}
