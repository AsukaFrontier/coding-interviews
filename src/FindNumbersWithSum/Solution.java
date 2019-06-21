package FindNumbersWithSum;
import java.util.ArrayList;
public class Solution
{
    //
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum)
    {
        ArrayList<Integer> aList= new ArrayList<>();
        if(findNumberPairs(array, sum).size()==0)
            return aList;
        aList.add(findNumberPairs(array, sum).get(0));
        aList.add(findNumberPairs(array, sum).get(1));
        return aList;
    }
    private ArrayList<Integer> findNumberPairs(int[] array, int sum)
    {
        //
        ArrayList<Integer> aList = new ArrayList<>();
        boolean[] pairs= new boolean[array.length];//default: false;
        for(int i=0;i<array.length-1;i++)//数组最后一个元素不需要考虑
        {
            //
            if(pairs[i])//如果该元素已有配对元素，则不予考虑
                continue;
            for(int j=i;j<array.length;j++)
            {
                if(pairs[j])
                    continue;
                if((array[i]+array[j])==sum)
                {
                    aList.add(array[i]);
                    aList.add(array[j]);
                }
            }
        }
        return aList;
    }
}
