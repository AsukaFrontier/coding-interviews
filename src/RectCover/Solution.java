package RectCover;

public class Solution {
    public int RectCover(int target)
    {
        int[] fibonacciBegins= new int[3];
        fibonacciBegins[0]=0;
        fibonacciBegins[1]=1;
        fibonacciBegins[2]=2;
        return fibonacciRecursive(target, fibonacciBegins);
    }
    private int fibonacciRecursive(int n, int[] fibonacciBegins)
    {
        if(n<=2)
            return fibonacciBegins[n];
        return fibonacciRecursive(n-1, fibonacciBegins)+fibonacciRecursive(n-2, fibonacciBegins);
    }
}
