import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The Utility class contains methods to read files 'Dungeon.csv' and 'users.csv' and methods that
 * check the username and passwordinputed by the user. If no user is found
 * another method will allow the user to register
 * @author Edgar Arellano
 *
 */
class Utility {
    private List<String[]> userDataArray;
    public void userDataFile(String userFile){
        this.userDataArray = readUserInfo(userFile);
    }

    /**
     * This method reads the dungeon file "Dungeon.csv" and stores into an array
     * @param dungeonFile
     * @return this method returns the map after reading the 'Dungeon.csv' file
     */
    public String[][] readDungeon(String dungeonFile) {
        List<String[]> dungeonMap = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(dungeonFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                dungeonMap.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] map = new String[dungeonMap.size()][];
        for (int i = 0; i < dungeonMap.size(); i++) {
            map[i] = dungeonMap.get(i);
        }
        return map;
    }

    /**
     * This method reads the file 'Users.csv' and stores in arrayList
     * @param userFile
     */
    public List<String[]> readUserInfo(String userFile){
        List<String[]> userData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(userFile))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                userData.add(userInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userData;
    }

    /**
     * This method checks the username and password entered by the player and returns a boolean upon
     * success or failure
     *
     * @param targetUsername
     * @param targetPassword
     * @return boolean depending on successful user and password
     */
    public boolean checkUser(String targetUsername, String targetPassword){
        for (String[] userData : userDataArray) {
            if (userData.length == 11) {
                String username = userData[2];
                String password = userData[5];

                if (username.equals(targetUsername) && password.equals(targetPassword)) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Allows the user to register as new user with the parameters as inputs
     *
     * @param state
     * @param username
     * @param firstname
     * @param password
     * @param lastName
     * @param city
     * @param zip
     * @param dateOfBirth
     */
    public void registerUser(String state, String username, String firstname, String password, String lastName, String city, String zip, String dateOfBirth){
        String newEntry = state + ",0," + username + firstname + ",0," + password + lastName + city + zip + dateOfBirth;
        userDataArray.add(newEntry.split(","));

        try{
            FileWriter writer = new FileWriter("Users.csv");
            writer.write("New User");
        }catch (IOException e){
            e.printStackTrace();
        }



    }
    /**
     * Creates a saveFile for the game
     * @param targetUsername
     */
    public void updateUser(String targetUsername){

        for (String[] userData : userDataArray) {
            if (userData.length == 11) {
                String username = userData[2];


                if (username.equals(targetUsername)) {
                    userData[1] =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                }
            }
        }
    }
}
