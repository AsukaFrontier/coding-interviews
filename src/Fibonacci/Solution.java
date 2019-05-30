package Fibonacci;
//
public class Solution {
    public int fibonacci(int n)
    {
        //0,1,1,2,3,5,8,13,21,34,...
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 1;
        else if(n==3)
            return 2;
        long[] fibonacci= new long[n+1];
        fibonacci[0]=0;
        fibonacci[1]=1;
        fibonacci[2]=1;
        fibonacci[3]=2;
        for(int i=4;i<=n;i++)
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        //
        return (int) fibonacci[n];
    }
    //----------UNIT TEST------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        System.out.print(s.fibonacci(39));
    }
}
