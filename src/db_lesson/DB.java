package db_lesson;

import java.rmi.ConnectException;
import java.sql.*;

public class DB {
    private final String host = "localhost"; //host
    private final String port = "5432"; //host
    private final String db_name = "test"; //host
    private final String login = "postgres"; //host
    private final String password = "123"; //host

    private Connection dbConn;

    private Connection getDBConnection() throws ClassNotFoundException, SQLException {
        String str =  "jdbc:postgres://" + host+":" + port + "/" + db_name;
        Class.forName("org.postgresql.Driver");
        dbConn = DriverManager.getConnection(str, login, password);
        return dbConn;

    }


    public void isConnection() throws SQLException, ClassNotFoundException {
        dbConn = getDBConnection();
        System.out.println(dbConn.isValid(1000));
    }

    public void createTAble(String tablename) throws SQLException, ClassNotFoundException {
        String sql = "CREATE TABLE IF NOT EXIST " + tablename + "(id INT PRIMARY KEY, name VARCHAR(50), passsword VARCHAR(15))";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);

    }



}
