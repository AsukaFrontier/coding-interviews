package NumberOf1;
import java.util.Stack;
public class Solution
{
    public int numberOf1(int n)
    {
        //
        StringBuffer sb= binaryString(n);
        String s="1";
        int count=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.indexOf(s,i)!=-1)
            {
                i=sb.indexOf(s,i);
                count++;
            }
        }
        return count;
    }
    private StringBuffer binaryString(int n)
    {
        StringBuffer sb= new StringBuffer();
        if(n>0)
            return positiveBinaryToString(n);
        else if(n==0)
                return sb.append(0);
        else
        {
            int negative_to_positive= -n;
            long negative_binary= ((negative_to_positive^0xffff_ffffL)+1);
            return positiveBinaryToString(negative_binary);
        }
    }
    private StringBuffer positiveBinaryToString(long n)
    {
        //
        Stack<Long> s= new Stack<>();
        StringBuffer sb= new StringBuffer();
        while(n/2!=0)
        {
            s.push(n%2);
            n=n/2;
        }
        s.push(n%2);
        while(!s.isEmpty())
            sb.append(s.pop());
        return sb;
    }
    //--------------------UNIT TEST-------------------------------//
    public static void main(String[] args)
    {
        int n=-0;
        Solution s= new Solution();
        int count= s.numberOf1(n);
        System.out.println(count);
    }
}
