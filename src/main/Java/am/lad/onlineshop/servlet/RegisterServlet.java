package am.lad.onlineshop.servlet;


import am.lad.onlineshop.model.user.User;
import am.lad.onlineshop.model.user.UserAtribute;
import am.lad.onlineshop.service.user.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by David on 3/22/2018.
 */
public class RegisterServlet extends HttpServlet {

    private UserServiceImpl service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        service = new UserServiceImpl();
        try {
            service.save(new User(req.getParameter("login"), req.getParameter("passH"), User.Role.ROLE_USER),
                    new UserAtribute(req.getParameter("firstName"), req.getParameter("lastName"), req.getParameter("email")));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        resp.sendRedirect("/");

    }
}
