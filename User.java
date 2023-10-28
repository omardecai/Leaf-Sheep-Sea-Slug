/*
 * Represents each users data including their username, pin, and last sign in time. 
 * @author Juan Holguin
 */
public class User{

    private String username; 
    private int pin; 
    private String lastSignIn;

    
    /** 
     * Initializes username for User.
     * 
     * @param usernameSetter name of the user.
     * 
     */
    public void setUsername(String usernameSetter){
        this.username = usernameSetter; 
    }
    
    /** 
     * Initializes the user's pin
     * 
     * @param pinSetter the pin of the user. 
     */
    public void setPin(int pinSetter){
        this.pin = pinSetter;
    }
    
    /** 
     * Sets the user's last sign in time.
     * 
     * @param LSI string of last sign in. 
     */
    public void setLastSignIn(String LSI){
        this.lastSignIn = LSI;
    }
    
    /** 
     * @return string value of the username of user.
     */
    public String getUsername(){
        return username;
    }
    
    /** 
     * @return int value of user's pin.
     */
    public int getPin(){
        return pin;
    }
    
    /** 
     * @return the String value of the user's last sign in. 
     */
    public String getLastSignIn() {
        return lastSignIn;
    }

}