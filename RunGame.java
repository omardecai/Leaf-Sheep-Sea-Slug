import java.util.Objects;
import java.util.Scanner;

/**
 * The RunGame class puts together and controls the
 * flow of the dungeon crawler game.
 *
 * @author Hector Jimenez
 */
public class RunGame {
    private static User user = new User();
    private static final Dungeon dungeon = new Dungeon();
    private static final Utility utility = new Utility();

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Dungeon Crawler!");
        utility.userDataFile("Users.csv");
        main_menu();


    }

    /**
     * The main_menu method takes charge of display the options the users
     * can take before starting a game
     */
    public static void main_menu(){

        System.out.println("-----Main Menu-----");
        System.out.println("a. Register");
        System.out.println("b. Login");
        System.out.println("c. Exit");

        String option = sc.next();

        switch (option) {
            case "a":
                register();
                break;
            case "b":
                login();
                break;
            case "c":
                break;
            default:
                System.out.println("This input is invalid. Try Again.");
                main_menu();
        }
    }

    /**
     * The login_menu method is a different variation of the main_menu for when
     * a user has confirmed his credentials.
     */
    public static void login_menu(){
        System.out.println("-----Main Menu-----");
        System.out.println("a. Logout");
        System.out.println("b. New Game");
        System.out.println("c. Exit");

        String option = sc.next();

        switch (option) {
            case "a":
                logout();
                main_menu();
                break;
            case "b":
                new_game();
                break;
            case "c":
                utility.updateUser(user.getUsername());
                break;
            default:
                System.out.println("This input is invalid. Try Again.");
                main_menu();
        }
    }

    /**
     * The register method asks the user for information relating to them
     * to register the new user into the file
     */
    public static void register(){
        System.out.println("Please enter the following information to register:");
        System.out.print("First Name: ");
        String firstname = sc.next();
        System.out.print("Last Name: ");
        String lastname = sc.next();
        System.out.print("New Username: ");
        String username = sc.next();
        System.out.print("New Pin Number: ");
        String pin = sc.next();
        System.out.print("State (ex. TX): ");
        String state = sc.next();
        System.out.print("City: ");
        String city = sc.next();
        System.out.print("Zip Code: ");
        String zip = sc.next();
        System.out.print("Date of Birth (mm/dd/yy): ");
        String dateOfBirth = sc.next();
        utility.registerUser(state,username,firstname,pin,lastname,city,zip,dateOfBirth);
        System.out.println("Registration Complete!");
        login();
    }


    /**
     * The login method asks the user for his credentials and
     * makes sure if the user has access to the game
     *
     * If the user successfully logins the users files will be updated
     * with his last login time
     */
    public static void login(){
        System.out.print("Enter Username: ");
        String username = sc.next();
        System.out.print("Enter PIN: ");
        String pin = sc.next();



        if(utility.checkUser(username, pin)){
            user.setUsername(username);
            user.setPin(pin);
            utility.updateUser(username);
            login_menu();
        }else {
            System.out.println("Username or Password maybe be wrong. Try Again");
            login();
        }


    }


    /**
     * The logout class updates the users file with the
     * total time played.
     */
    public static void logout(){
        utility.updateUser(user.getUsername());
        user = new User();
        main_menu();
    }

    /**
     * The new_game method clears the dungeon of any changes and
     * starts a fresh game for the users.
     */
    public static void new_game(){
        System.out.println("New Game Method");
        dungeon.setMap(utility.readDungeon("Dungeon.csv"));
        game();
    }

    /**
     * The game method controls the flow of the game updating the log.
     */
    private static void game() {
        int x;
        int y;
        while(true){
            dungeon.printMap();
            System.out.print("Enter the room you want to go into as 'x y'. enter '-1 -1' to exit to main menu\n> ");
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == -1 || y == -1){
                if(!user.getUsername().equals("unknown")) {
                    login_menu();
                }else {
                    main_menu();
                }
                break;
            }
            //dungeon.placePlayer(x, y);
            Log.msg("User "+ user.getUsername() + " player moved to ("+x+", "+y+") in the dungeon");
        }
    }
}