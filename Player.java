
/**
 * Represents a player character in a dungeon crawler game.
 * Tracks things like player character stats, positions, and
 * handles some actions related to dungeon crawling like
 * attacking, looting, and leveling up
 * 
 * @author Kelcey Calderon
 */
public class Player extends Person {

    private int attackBonus = 5;
    private int defense;
    private int HP = 5;
    private int XP;
    private int gold;
    private int[] position;
    private int level;

    /**
     * Initializes a new player with the given name.
     * 
     * @param name the name of the player.
     */
    public Player(String name) {
        super(name);
        this.position = new int[2];
    }

    // getters and setters

    /** @return the attack bonus of the player. */
    public int getAttackBonus() {
        return attackBonus;
    }

    /** @return the defense value of the player. */
    public int getDefense() {
        return defense;
    }

    /** @return the hit points (HP) of the player. */
    public int getHP() {
        return HP;
    }

    /** @return the experience points (XP) of the player. */
    public int getXP() {
        return XP;
    }

    /** @return the amount of gold the player has. */
    public int getGold() {
        return gold;
    }

    /** @return the position of the player in the dungeon as an array of size 2. */
    public int[] getPosition() {
        return position;
    }

    /** @return the level of the player. */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the attack bonus of the player.
     * 
     * @param attackBonus the attack bonus to set.
     */
    private void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    /**
     * Sets the defense value of the player.
     * 
     * @param defense the defense value to set.
     */
    private void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Sets the hit points (HP) of the player.
     * 
     * @param HP the hit points to set.
     */
    private void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * Sets the experience points (XP) of the player.
     * 
     * @param XP the experience points to set.
     */
    private void setXP(int XP) {
        this.XP = XP;
    }

    /**
     * Sets the amount of gold the player has.
     * 
     * @param gold the gold amount to set.
     */
    private void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Sets the position of the player in the dungeon.
     * 
     * @param x the x-coordinate of the position.
     * @param y the y-coordinate of the position.
     */
    private void setPosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }

    /**
     * Sets the level of the player.
     * 
     * @param level the level to set.
     */
    private void setLevel(int level) {
        this.level = level;
    }

    // Methods

    /**
     * Handles the player leveling up.
     * Should be called when needed in gainXP
     */
    private void levelUp() {
        // Stub
        Log.msg("Player leveled up.");
    }

    /** Handles the player's attack. */
    public void attack(Enemy enemy) {
        // Stub
        Log.msg("Player attacked");
    }

    /** Handles the player looting defeated enemies. */
    public void loot() {
        // Stub
        Log.msg("Player looted some items");
    }

    /** Handles the player's rest action. */
    public void rest() {
        // Stub
        Log.msg("Player is resting");
    }

    /** Handles the player gaining experience. */
    public void gainXP() {
        // Stub
        Log.msg("Player gained experience");
    }

    /** Handles opening the player's inventory */
    public void openInventory() {
        // Stub
        Log.msg("Player opened inventory");
    }

    /** Handles a player using an item */
    public void useItem(Item item) {
        // Stub
        Log.msg("Player used an item.");
    }
}
=======
/**
 * Represents a player character in a dungeon crawler game.
 * Tracks things like player character stats, positions, and
 * handles some actions related to dungeon crawling like
 * attacking, looting, and leveling up
 * 
 * @author Kelcey Calderon
 */
public class Player extends Person {

    private int attackBonus;
    private int defense;
    private int HP;
    private int XP;
    private int gold;
    private int[] position;
    private int level;

    /**
     * Initializes a new player with the given name.
     * 
     * @param name the name of the player.
     */
    public Player(String name) {
        super(name);
        this.position = new int[2];
    }

    // getters and setters

    /** @return the attack bonus of the player. */
    public int getAttackBonus() {
        return attackBonus;
    }

    /** @return the defense value of the player. */
    public int getDefense() {
        return defense;
    }

    /** @return the hit points (HP) of the player. */
    public int getHP() {
        return HP;
    }

    /** @return the experience points (XP) of the player. */
    public int getXP() {
        return XP;
    }

    /** @return the amount of gold the player has. */
    public int getGold() {
        return gold;
    }

    /** @return the position of the player in the dungeon as an array of size 2. */
    public int[] getPosition() {
        return position;
    }

    /** @return the level of the player. */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the attack bonus of the player.
     * 
     * @param attackBonus the attack bonus to set.
     */
    private void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    /**
     * Sets the defense value of the player.
     * 
     * @param defense the defense value to set.
     */
    private void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Sets the hit points (HP) of the player.
     * 
     * @param HP the hit points to set.
     */
    private void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * Sets the experience points (XP) of the player.
     * 
     * @param XP the experience points to set.
     */
    private void setXP(int XP) {
        this.XP = XP;
    }

    /**
     * Sets the amount of gold the player has.
     * 
     * @param gold the gold amount to set.
     */
    private void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Sets the position of the player in the dungeon.
     * 
     * @param x the x-coordinate of the position.
     * @param y the y-coordinate of the position.
     */
    private void setPosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }

    /**
     * Sets the level of the player.
     * 
     * @param level the level to set.
     */
    private void setLevel(int level) {
        this.level = level;
    }

    // Methods

    /**
     * Handles the player leveling up.
     * Should be called when needed in gainXP
     */
    private void levelUp() {
        // Stub
        Log.msg("Player leveled up.");
    }

    /** Handles the player's attack. */
    public void attack() {
        // Stub
        Log.msg("Player attacked");
    }

    /** Handles the player looting defeated enemies. */
    public void loot() {
        // Stub
        Log.msg("Player looted some items");
    }

    /** Handles the player's rest action. */
    public void rest() {
        // Stub
        Log.msg("Player is resting");
    }

    /** Handles the player gaining experience. */
    public void gainXP() {
        // Stub
        Log.msg("Player gained experience");
    }
}
