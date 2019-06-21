package FindContinuousSequence;
import java.util.ArrayList;
public class Solution {
    //
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum)
    {
        return formatToArrayLists(findSequence(sum));
    }
    private ArrayList<ArrayList<Integer>> formatToArrayLists(ArrayList<Integer> aList)
    {
        //
        int[] sequence= new int[aList.size()];
        for(int i=0;i<sequence.length;i++)
        {
            sequence[i]=aList.get(i);
        }
        ArrayList<ArrayList<Integer>> aListList= new ArrayList<>();
        for(int i=0;i<sequence.length-1;i=i+2)
        {
            ArrayList<Integer> aLists =new ArrayList<>();
            int begin=sequence[i];
            int end=sequence[i+1];
            aLists.add(begin);
            while(begin<end)
                aLists.add(++begin);
            aListList.add(aLists);
        }
        return aListList;
    }
    private ArrayList<Integer> findSequence(int sum)
    {
        int[] array_sequence= new int[sum];
        for(int i=0;i<array_sequence.length;i++)//初始化
            array_sequence[i]=i+1;//index: 0----99; value: 1----100;
        ArrayList<Integer> aLists= new ArrayList<>();
        for(int i=0;i<array_sequence.length-1;i++)//begin index; last element excluded;
        {
            int each_sum=0;
            for(int j=i;j<array_sequence.length;j++)//last element excluded;
            {
                if (each_sum < sum) {
                    each_sum += array_sequence[j];
                    continue;
                }
                if (each_sum == sum) {
                    aLists.add(array_sequence[i]);
                    aLists.add(array_sequence[--j]);//
                    break;
                } else//each_sum>=sum
                    break;
            }
        }
        return aLists;
    }
    //---------------------------------------------------------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        ArrayList<ArrayList<Integer>> aListLists= s.findContinuousSequence(3);
        for(ArrayList<Integer> aList: aListLists)
        {
            for(int i: aList)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
