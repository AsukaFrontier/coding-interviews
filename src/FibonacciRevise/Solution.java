package FibonacciRevise;
public class Solution
{
    //输出fibonacci数列的第n项, 第0项为0
    public int fibonacci(int n)
    {
        int[] fibonacciBegins= new int[2];
        fibonacciBegins[0]=0;
        fibonacciBegins[1]=1;
        return fibonacciRecursive(n, fibonacciBegins);
    }
    private int fibonacciRecursive(int n, int[] fibonacciBegins)
    {
        if(n<=1)
            return fibonacciBegins[n];
        return fibonacciRecursive(n-1, fibonacciBegins)+fibonacciRecursive(n-2, fibonacciBegins);
    }
}
