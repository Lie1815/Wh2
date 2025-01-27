package db_lesson;

import Login.Registration;

import java.rmi.ConnectException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static final String host = "127.0.0.1"; //host
    private static final String port = "5432"; //host
    private static final String db_name = "postgres"; //host
    private static final String login = "postgres"; //host
    private static final String password = "123"; //host

    private Connection dbConn;

    static Connection getDBConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://127.0.0.1/postgres";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        Connection conn = DriverManager.getConnection(url, props);
        return conn;

    }



    public void isConnection() throws SQLException, ClassNotFoundException {
        dbConn = getDBConnection();
        System.out.println(dbConn.isValid(1000));
    }

    public static void createTable(String tablename)throws SQLException, ClassNotFoundException{
        String sql = "CREATE TABLE " + tablename + " (id INT PRIMARY KEY, name VARCHAR(50), password VARCHAR(15))";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }


    public void selectTable (String tableName) throws SQLException, ClassNotFoundException {
        Statement statement = getDBConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from " + tableName);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);
            System.out.printf("%d. %s. %s. \n", id, name, password);
        }

    }
}







