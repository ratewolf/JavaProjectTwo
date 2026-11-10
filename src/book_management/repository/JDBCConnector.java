package book_management.repository;

import java.sql.*;

public class JDBCConnector {
    private static final String DRIVER_PATH = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
    private static final String USER_NAME = "c##aisoft";
    private static final String PASSWORD = "1234";

    private static Connection con;
    public static Connection getConnection() {
        try {
            // 1. JDBC Driver Memory Loading
            Class.forName(DRIVER_PATH);
            System.out.println("JDBC Driver Class founded!");

            // 2. Connection
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Connection Done Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver Class not founded.");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("Connection Failed.");
            throw new RuntimeException(e);
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
