package am.lad.onlineshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

/**
 * Created by David on 3/15/2018.
 */
public class DBConn {

//    private static DBConn instance;
 //   private Connection conn = null;


    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/onlineshop", "root","1111");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


/*    private DBConn() throws SQLException {
        //conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/onlineshop", "root","1111");
    }

    public static DBConn getInstance () {
        if (instance == null)
            try {
                instance = new DBConn();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return instance;
    }*/

}
