package am.lad.onlineshop.model.user;

/**
 * Created by David on 3/20/2018.
 */
public class User {

    public enum Role {
        ROLE_USER, ROLE_ADMIN
    }

    private Long id;
    private Long userAtr_id;
    private String login;
    private String passhash;
    private Role role;

    public User(String login, String passhash, Role role) {
        this.login = login;
        this.passhash = passhash;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserAtr_id() {
        return userAtr_id;
    }

    public void setUserAtr_id(Long userAtr_id) {
        this.userAtr_id = userAtr_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasshash() {
        return passhash;
    }

    public void setPasshash(String passhash) {
        this.passhash = passhash;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
