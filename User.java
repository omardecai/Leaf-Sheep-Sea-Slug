/**
 * The User class create an object where we save
 * important information of the user logged in. 
 *
 * @author Trey Holguin
 * @version 2.0
 */
public class User{
    
    private String username = "unknown";
    private String pin;
    private String lastSignIn;
    private int battlesWon, battlesLost, itemTotalNum, userGameCompletions;

    /** 
     * Setter method for the user's Username which will be referenced in RunGame.java
     * @param usernameSetter
     */
    public void setUsername(String usernameSetter){
        this.username = usernameSetter;
    }
    
    /** 
     * Setter method for the user's PIN which will be referenced in RunGame.java
     * @param pinSetter
     */
    public void setPin(String pinSetter){
        this.pin = pinSetter;
    }
    
    /** 
     * Setter method that sets the user's last login. 
     * @param LSI sets the user's last sign in time as a String.
     */
    public void setLastSignIn(String LSI){
        this.lastSignIn = LSI;
    }
    
    /**
     * Setter method for battlesWon attribute. 
     * @param won 
     */
    public void setBattlesWon(int won){
        this.battlesWon = won;
    }

    /**
     * Setter method for the battlesLost attribute. 
     * @param lost
     */
    public void setBattlesLost(int lost){
        this.battlesLost = lost;
    }

    /**
     * Sets the amount of items that the user has collected within the game.
     * @param items int value representing the user's total collect items. 
     */
    public void setItemTotalNum(int items){
        this.itemTotalNum = items;
    }

    /**
     * Will keep track of the amount of times the user has completed the game.
     * @param completions Number of the times the game has been completed 
     */
    public void setGameCompletions(int completions){
        this.userGameCompletions = completions; 
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

    /**
     * Getter method for the amount of battles the user has won. 
     * @return int value of battles won.
     */
    public int getBattlesWon(){
        return battlesWon; 
    }

    /**
     * Getter method for the amount of battles the user has lost.
     * @return int value of battles lost. 
     */
    public int getBattlesLost(){
        return battlesLost;
    }

    /**
     * Getter method for the amount of items the user has collected.
     * @return int value of the total items. 
     */
    public int getItemTotalNum(){
        return itemTotalNum; 
    }

    /**
     * Getter method for the amount of times the user has completed the game. 
     * @return int value of the number of times user has completed game. 
     */
    public int getGameCompletions(){
        return userGameCompletions; 
    }

}
