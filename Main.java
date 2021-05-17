package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        //Main m = new Main();
        testDatabase();
    }

    private static Connection testDatabase() {
        String url = "jdbc:mysql://localhost:3306/schema";
        String login = "root";
        String password = "5250";

        Connection con = null;
        try {
            DriverManager.registerDriver((Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema?user=root&password=5250?useSSL=false&serverTimeZone=UTC");

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return con;
    }
}
