import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by eddie on 6/10/2014.
 */
public class Game {
    public static ArrayList<Animal> animalList = new ArrayList<Animal>();
    public static ArrayList<Animal> fightList = new ArrayList<Animal>();

    public static void go() {


        Dog dog = new Dog();
        animalList.add(dog);

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the name of the animal you want: ");
        String s = scan.next();


        if(MenuOptions.checkInputValidity(s)){
            MenuOptions.menuPicker(s);
        }


        System.out.println("_______End Beep_______");
    }
   // public static void battlePhase(){

    //}
}

