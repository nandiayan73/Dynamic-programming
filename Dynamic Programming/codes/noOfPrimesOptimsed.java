 class noOfPrimesOptimsed{
    static int dp[];
    public boolean isPrime(int i,int n)
    {
        boolean flag=false;
        if(dp[i]==-1)
            flag=true;
        if(dp[i]==0)
            return false;
        int k=2,sum=i*k;
        while(sum<n)
        {
            dp[sum]=0;
            k++;
            sum=i*k;
        }
        return flag;
    }
    public int totalPrimes(int n)
    {
        int primes=0;
        for(int i=2;i<n;i++)
        {
            if(isPrime(i,n))
            {
                primes++;
            }
        }
        return primes;
    }
    public int countPrimes(int n) {
        dp=new int[n];
        Arrays.fill(dp,-1);
        int res=totalPrimes(n);
        return res;
    }
}