/**
 * This is the Dungeon class that sets and gets the dungeon map from the utility class
 * and prints the dungeon map
 * @author Edgar Arellano
 */
public class Dungeon {
    private String[][] map;

    /**
     * Getter method to return the map
     * @return this method returns the dungeon map
     */
    public String[][] getMap(){
        return map;
    }

    /**
     * This method sets the dungeonMap gathered from the Utility Class
     * @param dungeonMap
     */
    public void setMap(String[][] dungeonMap){
        this.map = dungeonMap;
    }

    /**
     * Print method to print out the dungeon map
     *
     */
    public void printMap(){
        for (String[] strings : map) {
            for (String string : strings) {
                if (string.equals("-1")) {
                    System.out.print("| ");
                } else {
                    System.out.print(string + " ");
                }
            }
            System.out.println();
        }
    }

    public void placePlayer(int x, int y) {
    }
}
