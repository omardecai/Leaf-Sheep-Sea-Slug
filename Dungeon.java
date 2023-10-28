/**
 * This is the Dungeon class that sets and gets the dungeon map from the utility class
 * and prints the dungeon map
 * @author Edgar Arellano
 */
class Dungeon {

    private String[][] map;

    /**
     * This method sets the dungeonMap gathered from the Utility Class
     * @param dungeonMap
     */
    public void setMap(String[][] dungeonMap) {
        map = dungeonMap;
    }

    /**
     * Getter method to return the map
     * @return this method returns the dungeon map
     */
    public String[][] getMap(){
        return map;
    }

    /**
     * Print method to print out the dungeon map
     * 
     */
    public void printMap() {
        for (String[] row : map) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

