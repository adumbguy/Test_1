import java.util.Arrays;

/**
 * Created by eddie on 6/12/2014.
 */
public class Dog extends Animal {
    public static void printStats(String ln) {
        int bHp = 50;
        int bDef = 5;
        int bAtk = 10;

        int[] bStats = new int[3];
        bStats[0] = bHp;
        bStats[1] = bDef;
        bStats[2] = bAtk;

        int[] dogStats = new int[3];
        dogStats[0] = bStats[0] + 5;
        dogStats[1] = bStats[1];
        dogStats[2] = bStats[2] + 5;

        if(ln.equals("nl")){
        System.out.println(Arrays.toString(dogStats));
        } else {
            System.out.print(Arrays.toString(dogStats));
        }
    }
}
