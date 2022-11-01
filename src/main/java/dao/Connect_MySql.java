package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_MySql {
    public static Connection getConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Demo_JDBC_C07";
            String username = "root";
            String pass = "12345678";
            return DriverManager.getConnection(url,username,pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
