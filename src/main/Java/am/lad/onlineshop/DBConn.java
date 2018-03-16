package am.lad.onlineshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

/**
 * Created by David on 3/15/2018.
 */
public final class DBConn {

    private static DBConn instance;
    public static Connection conn = null;

    private DBConn() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/onlineshop", "root","1111");
    }

    public static DBConn getInstance () {
        if (instance == null)
            try {
                instance = new DBConn();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return instance;
    }

}
