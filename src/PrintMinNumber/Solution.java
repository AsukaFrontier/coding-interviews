package PrintMinNumber;
import java.util.ArrayList;
public class Solution {
    //
    public String printMinNumber(int[] numbers)
    {
        ArrayList<StringBuilder> aList= new ArrayList<>();
        if(numbers.length==0)
            return "";
        aList= permutationToString(numbers, 0, aList);
        //
        ArrayList<Long> aListString= new ArrayList<>();
        for(StringBuilder sb: aList)
        {
            aListString.add(Long.parseLong(sb.toString()));
        }
        long min= Long.MAX_VALUE;
        for(Long i: aListString)
        {
            if (i<min)
                min=i;
        }
        return String.valueOf(min);
    }
    private ArrayList<StringBuilder> permutationToString(int[] numbers, int n, ArrayList<StringBuilder> aList)
    {
        if(n>=numbers.length-1)//n指数组最后一个元素
        {
            StringBuilder sb= new StringBuilder();
            for(int i: numbers)
            {
                sb.append(i);
            }
            aList.add(sb);
        }
        else//
        {
            for(int i=n;i<numbers.length;i++)//
            {
                {int temp= numbers[n]; numbers[n]=numbers[i]; numbers[i]= temp;}//code block
                permutationToString(numbers, n+1, aList);
                {int temp= numbers[n]; numbers[n]=numbers[i]; numbers[i]= temp;}//code block
            }
        }
        return aList;
    }
    //-----------------UNIT TEST-------------------//
    public static void main(String[] args)
    {
        int[] numbers= {3334,3,3333332};
        Solution s= new Solution();
        System.out.println(s.printMinNumber(numbers));
        /**
        ArrayList<StringBuilder> aList= new ArrayList<>();
        ArrayList<StringBuilder> aListSB= s.permutationToString(numbers, 0, aList);
        for(StringBuilder sb: aListSB)
        {
            System.out.println(sb.toString());
        }
         */
    }
}
