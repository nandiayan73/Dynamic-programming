class Tribonacci {
    static int dp[]=new int[100];
    public static  int tribonacci(int n) {
        if(n==0 || n==1 )
            return n;
        if(n==2)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        return dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
    public static void main(String[] args) {
        int n=tribonacci(35);
        System.out.print(n);
    }
}