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

    public static void printStats(String animal) {
        int bHp = 50;
        int bDef = 5;
        int bAtk = 10;

        int[] bStats = new int[3];
        bStats[0] = bHp;
        bStats[1] = bDef;
        bStats[2] = bAtk;

        int[] dStats = new int[3];
        dStats[0] = bHp + 5;
        dStats[1] = bDef;
        dStats[2] = bAtk + 5;

        int[] cStats = new int[3];
        cStats[0] = bHp - 5;
        cStats[1] = bDef - 5;
        cStats[2] = bAtk + 10;

        int[] pStat = new int[0];

        if (animal.equals("dog")) {
            pStat = dStats;
        }

        System.out.println(Arrays.toString(pStat));
    }




}

