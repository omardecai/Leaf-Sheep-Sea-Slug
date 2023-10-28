public class Dungeon {
    private String[][] map;

    public String[][] getMap(){
        return map;
    }

    public void setMap(String[][] map){
        this.map = map;
    }

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
