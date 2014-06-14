import java.util.Arrays;

/**
 * Created by eddie on 6/10/2014.
 */
public class Animal {
    public static int[] stats() {

        int bHp = 50;
        int bDef = 5;
        int bAtk = 10;

        int[] bStats = new int[3];
        bStats[0] = bHp;
        bStats[1] = bDef;
        bStats[2] = bAtk;

        return bStats;

    }

    public static void printStats() {
        int bHp = 50;
        int bDef = 5;
        int bAtk = 10;

        int[] bStats = new int[3];
        bStats[0] = bHp;
        bStats[1] = bDef;
        bStats[2] = bAtk;

        System.out.println(Arrays.toString(bStats));
    }




}

