package IsContinuous;
import java.util.Arrays;
//https://www.nowcoder.com/questionTerminal/762836f4d43d43ca9deb273b3de8e1f4?f=discussion
public class Solution //
{
    //依据题意numbers.length==0
    public static boolean isContinuous(int[] numbers)
    {
        if(numbers.length==0)
            return false;
        int numOfZeros= 0;
        int numOfGaps= 0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++)//
        {
            if(numbers[i]==0) //若前四个都是0, 则一定可构成continuous sequence
            {
                numOfZeros++;
                continue;
            }
            if(numbers[i]==numbers[i+1])
                return false;
            numOfGaps= numOfGaps+(numbers[i+1]- numbers[i]-1);
        }
        if(numOfGaps<=numOfZeros)
            return true;
        return false;
    }
    //---------------UNIT TEST--------//
    public static void main(String...args)
    {
        int[] arrs= {0,1,3,4,6};
        if(Solution.isContinuous(arrs))
            System.out.println("Is Continuous.");
        else
            System.out.println("Is Not Continuous.");
    }
}
