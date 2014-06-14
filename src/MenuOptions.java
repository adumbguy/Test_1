/**
 * Created by eddie on 6/13/2014.
 */
public class MenuOptions {
    public static String menuPicker (String input){ //Kinda redundant here, had an idea for it then forgot...

        String menu = input;

        if(menu.equals("list")){
            MenuOptions.list();
        }else if(menu.equals("help")){
            help();
        }

        return menu;
    }

    public static void list(){ //will display the "list" menu

        System.out.println("The list of available animals: ");
        System.out.println("Dog :");
        Dog.printStats();
    }

    public static void help(){ //will display the "help" menu

        System.out.println("First off, everything in this game should be typed in lower case!");
        System.out.println("There may be a fix for this someday, but not today.");
        System.out.println("");
        System.out.println("list            Prints a list of the animals.");
        System.out.println("help            Prints the 'help' screen.");
        System.out.println("stats           Prints a list of stats for a given animal.");
        System.out.println("quit            Quits the game immediately.");
        System.out.println("");
        Game.go();
    }

    public static boolean checkInputValidity(String input) { //Used to make sure the input is a valid choice
        boolean validity = false;

        if (input.equals("dog")) {
            validity = true;

        } else if (input.equals("stats")) {
            validity = true;

        } else if (input.equals("help")){
            validity = true;


        } else if (input.equals("list")){
            validity = true;


        } else{
            MenuOptions.invalid();

        }

        return validity;
    }

    public static void invalid() { //called when an invalid input is entered
        System.out.println("That is not a valid choice!");
        System.out.println();
        Game.go();
    }
}
