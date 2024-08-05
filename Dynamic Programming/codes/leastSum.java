public class leastSum {
    static int dp[];
    static int leastJumps(int arr[],int n)
    {
        if(n+arr[n]>=arr.length-1)
        {
            return 1;
        }
        if (n + arr[n] >= arr.length - 1) {
            dp[n]=1;
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int jump=arr.length-1,minJump=arr.length;
        for(int i=1;i<=arr[i];i++)
        {
            if(n+i<arr.length)   
                minJump=leastJumps(arr, n+i);
            jump=Math.min(jump,minJump);
        }
        dp[n]=jump+1;
        return 1+jump;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1};
        dp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dp[i]=-1;
        }
        System.out.println(leastJumps(arr, 0));
    }   
}
