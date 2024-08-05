class Solution{
    static int dp[];
    static  int largestSequence(int arr[])
    {
        int maxSeq=0;
        int maxLength=1;
        for(int i=0;i<arr.length;i++)
        {
            maxLength=1;
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                    maxLength=Math.max(maxLength,dp[j]+1);
            }
            dp[i]=maxLength;
            if(maxLength>maxSeq)
                maxSeq=maxLength;
        }
        return maxSeq;
    }
    static int maxSeq=0;
    public static void Solution2(int arr[],int n)
    {
        if(n==arr.length)
            return;
        int maxLength=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<arr[n])
            {
                maxLength=Math.max(maxLength, dp[i]+1);
            }
        }
        dp[n]=maxLength;
        if(maxSeq<maxLength)
            maxSeq=maxLength;
        Solution2(arr, n+1);

    }
    public static void main(String[] args) {
        // int arr[]={50,12,10,9,20,100};
        int arr[]={1,2,3,4,5,6};
        dp=new int[arr.length];
        // int res=largestSequence(arr);
        Solution2(arr,0);
        System.out.println(maxSeq);
    }
}