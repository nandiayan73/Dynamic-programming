public class Nladder {
    static int N=2,K=3;
    static int dp[]=new int[N+1];
    static int ladder(int n)
    {
        if(n==0 || n==1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        int ways=0;
        for(int i=1;i<=K && n-i>=0;i++)
        {
            ways+=ladder(n-i);
        }
        dp[n]=ways;
        return dp[n];

    }
    public static void main(String[] args) 
    {
        for(int i=0;i<N;i++)
        {
            dp[i]=0;
        }
        int res=ladder(N);
        System.out.println(res);
    }
}
