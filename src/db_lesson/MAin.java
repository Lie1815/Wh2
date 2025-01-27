package db_lesson;

import java.sql.SQLException;

public class MAin {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(DB.getDBConnection().isClosed());
        //DB.createTable("asdf");
        DB.createTable("asacfp");

    }
}
