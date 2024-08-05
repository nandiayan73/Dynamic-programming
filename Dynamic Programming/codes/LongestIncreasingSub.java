public class LongestIncreasingSub {
    static int dp[];
    static int solution(int arr[],int n)
    {
        int maxLength=0,sequence=1;
        for(int i=n+1;i<arr.length;i++)
        {
            if(arr[i]>arr[n])
                solution(arr,n+1);
            

        }

    }
    public static void main(String[] args) {
        int arr[]={50,4,10,8,30,100};
        dp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dp[i]=-1;
        }

    }
}
