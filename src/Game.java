
/**
 * Created by eddie on 6/10/2014.
 */
public class Game {



    public static void go() {

        System.out.println("___Start up___");

        System.out.println("Welcome to Charles Darwin's Mertle Cumbut!");
        System.out.println("Where you pit poor, undeserving animals against each other for your amusement.");
        System.out.println("");
        while (true) {


            System.out.println("Type the name of the animal you want: ");
            String s = Input.scan().next();


            if (MenuOptions.checkInputValidity(s)) {

                if (s.equalsIgnoreCase("quit")) {
                    break;

                }else{
                    MenuOptions.menuPicker(s);
                }
            }

        }


        //String s2 = scan().next();


        System.out.println("_______End Beep_______");
    }
}


