import java.util.Arrays;
public class CollectingCoins {
    static int dp[][];
    public static int maxCoins(int matrix[][],int i, int j)
    {
        int dCoins,rCoins;
        if(i>=matrix.length || j>=matrix[0].length)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        dCoins=maxCoins(matrix, i+1, j);
        rCoins=maxCoins(matrix, i, j+1);
        dp[i][j]=Math.max(dCoins,rCoins)+matrix[i][j];
        return dp[i][j];
    }
    public static void main(String[] args) {
        int matrix [][]={{0,3,1,1},{2,0,0,4}};
        dp=new int[matrix.length][matrix[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println("The max coins that can be collected is:\t"+maxCoins(matrix, 0, 0));

    }   
}
