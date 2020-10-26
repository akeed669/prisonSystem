package ooae2test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabase {

    private static MyDatabase uniqueInstance;

    private MyDatabase() {
    }

    public static MyDatabase getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyDatabase();
        }
        return uniqueInstance;
    }

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/hellsprisontest?serverTimezone=UTC";
        String uname = "root";
        String pword = "akeed";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pword);
            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {

        }
    }

}
