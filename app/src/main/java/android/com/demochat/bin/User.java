package android.com.demochat.bin;

/**
 * Created by amitrai on 23/5/16.
 */
public class User extends BaseBean {

    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
