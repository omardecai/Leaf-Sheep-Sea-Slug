import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Utility class contains methods to read files 'Dungeon.csv' and 'users.csv'
 * @author Edgar Arellano
 */
class Utility {
    
    
    /**
     * 
     * @param file
     * @return this method returns the map after reading the 'Dungeon.csv' file
     */
    public String[][] readDungeon(String file) {
        List<String[]> dungeonMap = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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
         * This method reads the file 'Users.csv' and checks the username and password entered by the user
         * @param filePath
         * @param targetUsername
         * @param targetPassword
         * @return this method returns a boolean after reading the users file and checking for password and username
         */
     public static boolean readUserInfo(String filePath, String targetUsername, String targetPassword){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (userInfo.length >= 3) {
                    String username = userInfo[2];
                    String password = userInfo[5];

                    if (username.equals(targetUsername)&& password.equals(targetPassword)) {
                        return true;
                    }
                    
                }
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
     }

     public void Savegame(String[] saveFile){
        
     }
}
