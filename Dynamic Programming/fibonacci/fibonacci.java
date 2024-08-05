class fibonacci
{
    static int fibo[]=new int [100];
    public static int solution(int n)
    {
        if(n==0 || n==1)
            return n;
        
        if(fibo[n]!=0)
            return fibo[n];
        
        return fibo[n]=solution(n-1)+solution(n-2);
    }
    public static void main(String[] args) 
    {
        int length=16;
        for (int i=0;i<length;i++)
        {
            fibo[i]=0;
        }

        int res=solution(3);
        System.out.print(res);
    }
}