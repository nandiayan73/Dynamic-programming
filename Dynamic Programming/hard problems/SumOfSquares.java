public class SumOfSquares {
    static int dp[];
    public static int solution(int squares[],int num)
    {
        if(num==0)
            return 0;
        if(dp[num]!=-1)
        {
            return dp[num];
        }
        int dif=0,least=Integer.MAX_VALUE;
        for(int sq: squares)
        {
            if(num-sq>=0)
            {

                dif=solution(squares,num-sq);
                least=Math.min(least,dif);
            }
            else
                break;
        }
        dp[num]=least+1;
        return dp[num];
    }
    public static void main(String[] args) {
        int num=15,res=-9;
        int k=0;
        
        dp=new int[num+1];
        for(int i=0;i<=num;i++)
        {
            dp[i]=-1;
        }
        int maxSquareRoot = (int) Math.sqrt(num);
        int[] squares = new int[maxSquareRoot];
        for(int i =1;i*i<=num;i++)
        {
            squares[k++]=i*i;
            if(i*i==num)
                res=1;
        }
        if(res==-9)
            res=solution(squares, num);
        System.out.println(res);
    }
}
