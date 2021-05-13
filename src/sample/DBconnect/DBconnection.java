package sample.DBconnect;

import sample.QuestionSection.QuestionAndAnswer;

import java.sql.*;
import java.util.ArrayList;

public class DBconnection {
        private final String url = "jdbc:mysql://localhost:3306/quizapp";
        private final String username = "root";
        private final String password = "Csglobal328!";
        private  Connection connection;
        private ResultSet result;
        private Statement statement;
        private ArrayList<QuestionAndAnswer> List;
    public DBconnection() {
        List = new ArrayList<>();
        try {
            this.connection = DriverManager.getConnection(this.url , this.username, this.password);

        } catch (SQLException e) {
            System.out.println("daheck"+e);
            e.printStackTrace();
        }
    }

    public String[] getQuestions(){
        String[] Questions = new String[3];
        String sql = "SELECT * FROM asuult";
        try {
            statement = this.connection.createStatement();
            result = statement.executeQuery(sql);
                int i=0;
                while(result.next()){
                    Questions[i] = result.getString(1);
                }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("sql select hiij bolsongui!");
        }
      return Questions;
    }


}
