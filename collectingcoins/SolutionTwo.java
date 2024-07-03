package collectingcoins;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwo
{

    public static int collectingCoins(int N, int[][] Coins) {
        Map<Integer, Integer> hor = new HashMap<>(); // stores the horizontal count of coins at each x-coordinate
        Map<Integer, Integer> ver = new HashMap<>(); // stores the vertical count of coins at each y-coordinate
        Map<Integer, Integer> diaa = new HashMap<>(); // stores the count of coins along diagonal line a = x + y
        Map<Integer, Integer> diab = new HashMap<>(); // stores the count of coins along diagonal line a = x - y
        int m = 0; // variable to keep track of maximum count

        // iterating through the Coins array
        for (int[] el : Coins) {
            int a = el[0], b = el[1];
            hor.put(a, hor.getOrDefault(a, 0) + 1); // incrementing the horizontal count at x-coordinate a
            ver.put(b, ver.getOrDefault(b, 0) + 1); // incrementing the vertical count at y-coordinate b
            diaa.put(a + b, diaa.getOrDefault(a + b, 0) + 1); // incrementing the count along diagonal a = x + y
            diab.put(a - b, diab.getOrDefault(a - b, 0) + 1); // incrementing the count along diagonal a = x - y

            // updating the maximum count m
            m = Math.max(m, hor.get(a));
            m = Math.max(m, ver.get(b));
            m = Math.max(m, diaa.get(a + b));
            m = Math.max(m, diab.get(a - b));
        }
        return m; // returning the maximum count

       
    }


}
