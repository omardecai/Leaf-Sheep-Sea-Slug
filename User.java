public class User{

    private String username; 
    private int pin; 
    private String lastSignIn;

    public void setUsername(String usernameSetter){
        this.username = usernameSetter; 
    }
    public void setPin(int pinSetter){
        this.pin = pinSetter;
    }
    public void setLastSignIn(String LSI){
        this.lastSignIn = LSI;
    }
    public String getUsername(){
        return username;
    }
    public int getPin(){
        return pin;
    }
    public String getLastSignIn() {
        return lastSignIn;
    }

}