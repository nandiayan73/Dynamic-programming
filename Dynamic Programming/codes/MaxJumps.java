import java.util.*;
class MaxJumps{
    static int dp[];
    public boolean maxJump(int[]nums,int n)
    {
        if(n==nums.length-1)
        {
            return true;
        }
        if(n>nums.length)
        {
            return false;
        }
        if(dp[n]!=-1)
        {
            if(dp[n]==0)
                return false;
            if(dp[n]==1)
                return true;
            
        }
        boolean res;
        for(int i=n+1;i<=nums[n]+n;i++)
        {
            res=maxJump(nums,i);
            if(res==true)
            {
                dp[n]=1;
                return true;
            }
        }
        dp[n]=0;
        return false;
        
    }
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length==1)
            return true;
        dp=new int [nums.length];
        Arrays.fill(dp,-1);
        return maxJump(nums,0);
    }
}