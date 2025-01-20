package db_lesson;

import java.sql.SQLException;

public class MAin {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DB db = new DB();
        db.isConnection();
        db.createTAble("user_table");
    }
}
