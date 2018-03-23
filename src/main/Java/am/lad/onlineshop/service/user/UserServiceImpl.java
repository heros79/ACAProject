package am.lad.onlineshop.service.user;

import am.lad.onlineshop.DBConn;
import am.lad.onlineshop.model.user.User;
import am.lad.onlineshop.model.user.UserAtribute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by David on 3/20/2018.
 */
public class UserServiceImpl implements UserService {

    private PreparedStatement statement = null;

    @Override
    public void save(User user, UserAtribute userAtribute) throws SQLException {

        Connection conn = new DBConn().getConnection();
        conn.setAutoCommit(false);

        try {
            statement = conn.prepareStatement("INSERT INTO useratributes" +
                    "(firstname, lastname, email) VALUE (?, ?, ?)");
            statement.setString(1, userAtribute.getFirstName());
            statement.setString(2, userAtribute.getLastName());
            statement.setString(3, userAtribute.getEmail());

            statement.executeUpdate();

            statement = conn.prepareStatement("SELECT LAST_INSERT_ID() FROM useratributes");

            ResultSet rs = statement.executeQuery();

            rs.next();
            int a = rs.getInt(1);

            statement = conn.prepareStatement("INSERT INTO users" +
                    "(useratr_id, login, pash, role) VALUE (?, ?, ?, ?)");
            statement.setLong(1, a);
            statement.setString(2, user.getLogin());
            statement.setString(3, user.getPasshash());
            statement.setString(4, user.getRole().toString());

            statement.executeUpdate();

            conn.commit();

        } catch (SQLException e) {
            conn.rollback();
            e.printStackTrace();
        } finally {
            conn.setAutoCommit(true);
        }
    }
}
