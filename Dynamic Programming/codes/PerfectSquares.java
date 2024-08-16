import java.util.*;
class PerfectSquares {
    static int dp[];
    public static int calcSteps(int n,int squares[],int l)
    {
        
        if(n==0)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        if(n<0)
            return 0;

        int steps=Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            if(n-squares[i]>=0)
            {
                steps=Math.min(calcSteps(n-squares[i],squares,l),steps);
            }
        }
        dp[n]=steps+1;
        return dp[n];
    }
    public static int numSquares(int n) {
        int squares[]=new int[n];
        int i=1,k=0;
        dp=new int[n+1];
        Arrays.fill(dp, -1);
        while(i*i<=n)
        {
            if(i*i==n)
            {
                return 1;
            }
            squares[k++]=i*i;
            i++;
        }
        int res=calcSteps(n,squares,k);
        return res-1;
    }
    public static void main(String[] args) {
        int res=numSquares(15);
    }
}