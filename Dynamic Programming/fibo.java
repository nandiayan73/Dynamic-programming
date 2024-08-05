import java.util.Scanner;


public class fibo {
    static int dp[]=new int[100];
    public static int fibonacci(int n)
    {
        if(n==0|| n==1)
            return n;
        if(dp[n]!=0)
            return dp[n];
        return dp[n]=fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:\t");
        int l=sc.nextInt();
        int res= fibonacci(l);
        System.out.println(res);
    }
}
