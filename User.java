/**
 * The User class create an object where we save
 * important information of the user logged in. 
 *
 * @author Trey Holguin
 * @version 1.1 
 */
public class User{
    
    private String username = "unknown";
    private String pin;
    private String lastSignIn;

    
    /** 
     * Sets the user's Username which will be referenced in RunGame.java
     * @param usernameSetter
     */
    public void setUsername(String usernameSetter){
        this.username = usernameSetter;
    }
    
    /** 
     * Sets the user's PIN which will be referenced in RunGame.java
     * @param pinSetter
     */
    public void setPin(String pinSetter){
        this.pin = pinSetter;
    }
    
    /** 
     * 
     * @param LSI sets the user's last sign in time as a String.
     */
    public void setLastSignIn(String LSI){
        this.lastSignIn = LSI;
    }
    
    /** 
     * Getter method for obtaining user's PIN. 
     * @return username as a String
     */
    public String getUsername(){
        return username;
    }
    
    /** 
     * Getter method for obtaining user's PIN. 
     * @return PIN as String
     */
    public String getPin(){
        return pin;
    }
    
    /** Getter method for obtaining user's Last Sign In information. 
     * @return String
     */
    public String getLastSignIn() {
        return lastSignIn;
    }

}
