import java.util.*;
class decodeWays {
    static int dp[];
    public int decodeWaysSol(String s,int i) {
        int count=0;
        if(i==s.length())
            return 1;
        if(s.charAt(i)=='0')
            return 0;
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        // onedigit:
        count=decodeWaysSol(s,i+1);
        // twodigit:
        if(i+1<s.length())
        {
            int num=Integer.parseInt(s.substring(i,i+2));
            if(num<=26)
            {
               count += decodeWaysSol(s,i+2);
            }
        }
        dp[i]=count;
        return count;

    }
    public int numDecodings(String s) {
        
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        if(s.charAt(0)=='0')
            return 0;
        int res=decodeWaysSol(s,0);
        return res;

    }
}