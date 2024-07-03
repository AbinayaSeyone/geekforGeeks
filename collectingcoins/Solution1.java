package collectingcoins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            Solution2 obj = new Solution1().new Solution2();
            int[][] coins = obj.input(br, N, 3);
            obj.print(coins);
            int res = obj.collectingCoins(N, coins);
            System.out.println(res);

        }
    }

    public class Solution2 {
        public int collectingCoins(int N, int[][] coins) {
            int count=0;
            for(int i=0;i<=N;i++){

                for(int j=0;j<=N;j++){
                    if(coins[i][j]!=0)
                    {
                        count = 0;
                        for( int k = coins[i][j]; k <= ( ( coins[i][j] ) + N +1 ) && j <= ( ( coins[i][j] ) + N +1 ); k++ )
                        {
                            j++;
                            count++;
                        }
                    }
                }
            }
            return count; // Placeholder implementation, replace with your logic
        }

        public int[][] input(BufferedReader br, int n, int m) throws IOException {
            int[][] mat = new int[n][];

            for (int i = 0; i < n; i++) {
                mat[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            return mat;
        }

        public void print(int[][] m) {
            Arrays.stream(m).forEach(row -> {
                Arrays.stream(row).forEach(e -> System.out.print(e + " "));
                System.out.println();
            });
        }
    }
}
