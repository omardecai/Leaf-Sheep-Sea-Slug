import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is the Dungeon class that sets and gets the dungeon map from the utility class
 * , prints the dungeon map, checks for player moves, and updates the dungeon if needed
 * @author Edgar Arellano
 */
class Dungeon {

    private Map<String, Map<String, String>> map;


    /**
     * This method sets the dungeonMap gathered from the Utility Class
     * @param dungeonMap
     */
    public void setMap(Map<String, Map<String, String>> dungeonMap) {
        this.map = dungeonMap;
    }
    
    /**
     * Getter method to return the map
     * @return this method returns the dungeon map
     */
    public Map<String, Map<String, String>> getMap() {
        return map;
    }

    /**
     * Print method to print out the dungeon map
     * 
     */
    public void printMap() {
        System.out.println("------------------------------------------------------------------");
    
        for (int row = 0; row < 20; row++) {
            Map<String, String> rowMap = map.get(String.valueOf(row));
    
            if (rowMap != null) {
                List<String> sortedColumns = new ArrayList<>(rowMap.keySet());
                Collections.sort(sortedColumns);
    
                for (int col = 0; col < 24; col++) {
                    String colKey = String.valueOf(col);
                    String cellValue = rowMap.get(colKey);
    
                    switch (cellValue) {
                        case "-1":
                            System.out.print("| ");
                            break;
                        case "0":
                            System.out.print("0 ");
                            break;
                        case "e":
                            System.out.print("e ");
                            break;
                        case "$":
                            System.out.print("$ ");
                            break;
                        default:
                            System.out.print(cellValue);
                    }
                }
            } 
            
    
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
    }

    /**
     * Checks if the next move by the player is possible.
     *
     * @param row The row coordinate of the next move.
     * @param col The column coordinate of the next move.
     * @return true if the move is possible, false otherwise.
     */
    public boolean isMovePossible(int row, int col) {
        if (map == null || row < 0 || row >= map.size()) {
            return false;
        }

        Map<String, String> rowMap = map.get(String.valueOf(row));
        return rowMap != null && col >= 0 && col < rowMap.size();
    }


    /**
    * This method updates the cells that the player has explored 
    * Cells that a player has explored are marked as x,
    * and cells that a player has not explored are marked u.
    *
    */
    public void updateExploredCell(int playerRow, int playerCol) {
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            String rowKey = entry.getKey();
            Map<String, String> rowMap = entry.getValue();

        for (Map.Entry<String, String> cellEntry : rowMap.entrySet()) {
            String colKey = cellEntry.getKey();
            if (Integer.parseInt(rowKey) == playerRow && Integer.parseInt(colKey) == playerCol) {
              // If the cell has been explored it will appear as x
                rowMap.put(colKey, "x");
            } else {
              // If the cell has not been explored it will appear as u
                rowMap.put(colKey, "u");
            }
        }
        }
    }

    /**
     * Updates the player's position and displays it in the dungeon.
     *
    * @param playerRow The new row coordinate of the player.
    * @param playerCol The new column coordinate of the player.
    */
    public void updatePlayerPosition(int playerRow, int playerCol) {
        if (isMovePossible(playerRow, playerCol)) {
           // Update the player's position in the dungeon
           map.get(String.valueOf(playerRow)).put(String.valueOf(playerCol), "$");

          // Print the updated dungeon map
         printMap();
        } else {
         System.out.println("Invalid move. Player position remains unchanged.");
     }
    }
    
}
