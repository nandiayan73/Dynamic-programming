import java.util.Arrays;
public class MaxProductSubArr {
    static int dp[];
    public static int MaxProduct(int arr[],int n,int prev)
    {
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        if()
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        dp=new int[arr.length];
        Arrays.fill(dp,-1);
        int maxProduct=MaxProduct(arr,0,0);
        System.out.println(maxProduct);;

    }
    
}
