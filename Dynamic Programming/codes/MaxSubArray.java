class Solution {
    public int getRes(int nums[])
    {   
        int a=0,b=0,sum,maxSum,p=0,q=0,allSum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            a=i;
            sum=nums[i];
            b=0;
            maxSum=sum;
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>maxSum)
                {
                    maxSum=sum;
                    b=j;
                }
            }
            System.out.println(maxSum);
            System.out.println(a+" "+b);
            if(allSum<maxSum)
            {
                p=a;
                q=b;
                allSum=maxSum;
            }
        }
      
        return allSum;

    }
    public int maxSubArray(int[] nums) {
    int res=getRes(nums);
    return res;
        
    }
}