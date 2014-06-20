import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by eddie on 6/13/2014.
 */
public class MenuOptions {
    public static void menuPicker (String input){ //Kinda redundant here, had an idea for it then forgot...

        String menu = input;

        if(menu.equalsIgnoreCase("list")){
            MenuOptions.list();
        }else if(menu.equalsIgnoreCase("help")){
            MenuOptions.help();
        }else if(menu.equalsIgnoreCase("stats")){
            MenuOptions.stats();
        }else if(menu.equalsIgnoreCase("uitest")){
            UI.ui();
        }


    }

    public static void stats(){
        Scanner input = new Scanner(System.in);

        System.out.println("Stats are shown as [Max HP, Def, Atk] .");
        System.out.println("Type 'back' to return.");
        System.out.println("Whose stats would you like to see?: ");
        String in = input.next();
        if(in.equals("back")){
            System.out.println("");
            return;
        }else{
            Animal.printStats(in);
            System.out.println("");
        }

    }

    public static void list(){ //will display the "list" menu

        String[] list = new String[1];
        list[0] = "1. Dog";

        System.out.println("The list of available animals: " + Arrays.toString(list));
        System.out.println("");

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
        return;

    }

    public static boolean checkInputValidity(String input) { //Used to make sure the input is a valid choice
        boolean validity = false;

        if (input.equalsIgnoreCase("dog")) {
            validity = true;

        } else if (input.equalsIgnoreCase("stats")) {
            validity = true;

        } else if (input.equalsIgnoreCase("help")){
            validity = true;

        } else if (input.equalsIgnoreCase("list")) {
            validity = true;

        } else if(input.equalsIgnoreCase("quit")){
            validity = true;

        }else if(input.equalsIgnoreCase("uitest")){
            validity = true;

        }else{
            MenuOptions.invalid();

        }

        return validity;
    }

    public static void invalid() { //called when an invalid input is entered
        System.out.println("That is not a valid choice!");
        System.out.println();

    }
}
