import java.util.Scanner;

public class NladderRevised {
    static int dp[]=new int[100];
    public static int totalSteps(int n,int k)
    {
        // System.out.println(n);
        int ways=0;
        if(n<0)
            return 0;
        if(n==0 || n==1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        for(int i=1;i<=k;i++)
        {
            ways+=totalSteps(n-i, k);
        }
        dp[n]=ways;
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stair you want to reach:\t");
        int n=sc.nextInt();
        System.out.println("Enter the the max. steps you can take:\t");
        int k=sc.nextInt();
        int res=totalSteps(n,k);
        System.out.println("Total no. of ways you can reach the stair:\t"+res);
    }
    
}
