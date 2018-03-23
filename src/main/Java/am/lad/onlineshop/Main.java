package am.lad.onlineshop;

import am.lad.onlineshop.model.product.Product;
import am.lad.onlineshop.model.user.User;
import am.lad.onlineshop.model.user.UserAtribute;
import am.lad.onlineshop.service.product.ProductServiceImpl;
import am.lad.onlineshop.service.user.UserServiceImpl;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by David on 3/15/2018.
 */
public class Main {

    public static void main(String[] args) {


        UserServiceImpl service = new UserServiceImpl();

        try {
            service.save(new User("david11", "david", User.Role.ROLE_ADMIN),
                    new UserAtribute("david", "david", "david"));
        } catch (SQLException e) {
            e.printStackTrace();
        }


/*        Date date = null;
        String d = "2018/03/18";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = formatter.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        System.out.println(sqlDate);*/
    }

}
