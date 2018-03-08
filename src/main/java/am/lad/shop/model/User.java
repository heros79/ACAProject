package am.lad.shop.model;


/**
 * Created by David on 3/8/2018.
 */
public class User {

    private enum Role {
        Admin, User, Guest;
    }

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private char[] password;
    private Integer age;
    private String telephonNumber;

}
