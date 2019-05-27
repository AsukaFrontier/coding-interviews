package JumpFloor12;

public class Solution {
    public int jumpFloor(int target)
    {
        //
        int n=target;
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else if(n==3)
            return 3;
        long[] fibonacci= new long[n+1];
        fibonacci[0]=0;
        fibonacci[1]=1;
        fibonacci[2]=2;
        fibonacci[3]=3;
        for(int i=4;i<=n;i++)
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        //
        return (int) fibonacci[n];
    }
}
