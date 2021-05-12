package sample.DBconnect;

import java.sql.*;

public class DBconnection {
        private final String url = "jdbc:mysql://localhost:3306/quizapp";
        private final String username = "root";
        private final String password = "Csglobal328!";
        private  Connection connection;
        private ResultSet result;
        private Statement statement;
    public DBconnection() {
        try {
            this.connection = DriverManager.getConnection(this.url , this.username, this.password);

        } catch (SQLException e) {
            System.out.println("daheck");
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
