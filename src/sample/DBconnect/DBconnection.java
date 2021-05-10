package sample.DBconnect;

import java.sql.*;

public class DBconnection {
    public static void main(String[] args){
        String url = "jdbc:mysql//localhost:3306/quizapp";
        String username = "root";
        String password = "Csglobal328!";

        try {
            Connection connection = DriverManager.getConnection(url , username, password);

            String sql = "Insert into question(username) VALUES (?)";

        } catch (SQLException e) {
            System.out.println("daheck");
            e.printStackTrace();
        }
    }
}
