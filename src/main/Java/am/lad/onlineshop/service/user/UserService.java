package am.lad.onlineshop.service.user;

import am.lad.onlineshop.model.user.User;
import am.lad.onlineshop.model.user.UserAtribute;

import java.sql.SQLException;

/**
 * Created by David on 3/20/2018.
 */
public interface UserService {

    void save (User user, UserAtribute userAtribute) throws SQLException;
}
