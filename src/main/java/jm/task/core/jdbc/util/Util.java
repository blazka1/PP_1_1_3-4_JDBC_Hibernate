package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_dbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";


    static {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка при подключении к базе данных");
        }
        return connection;
    }
}
