package GetLeastNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    //
    public ArrayList<Integer> getLeastNumbers(int[] input, int k)
    {
        Arrays.sort(input);
        ArrayList<Integer> sorted_array= new ArrayList<Integer>();
        if(k>input.length)
            return sorted_array;
        for(int i=0;i<k;i++)
            sorted_array.add(input[i]);
        return sorted_array;
    }
    //-----UNIT TEST------//
    public static void main(String[] args)
    {
        int[] input={4,5,1,6,2,7,3,8};
        Solution s= new Solution();
        for(int i: s.getLeastNumbers(input, 4))
            System.out.print(i+" ");
    }
}
