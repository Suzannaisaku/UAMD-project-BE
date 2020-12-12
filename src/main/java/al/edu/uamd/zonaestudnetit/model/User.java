package al.edu.uamd.zonaestudnetit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private int userId;
    private String userEmail;
    private String userName;
    private String userPassword;
    private String userSurname;

    public User() {
    }

    public User(int userId, String userEmail, String userName, String userPassword, String userSurname) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userSurname = userSurname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
