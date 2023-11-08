/**
 * The User class create an object where we save
 * important information of the user logged in
 *
 * @author Trey Holguin
 */
public class User{

    private String username = "unknown";
    private String pin;
    private String lastSignIn;

    public void setUsername(String usernameSetter){
        this.username = usernameSetter;
    }
    public void setPin(String pinSetter){
        this.pin = pinSetter;
    }
    public void setLastSignIn(String LSI){
        this.lastSignIn = LSI;
    }
    public String getUsername(){
        return username;
    }
    public String getPin(){
        return pin;
    }
    public String getLastSignIn() {
        return lastSignIn;
    }

}
