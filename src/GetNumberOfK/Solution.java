package GetNumberOfK;

import java.util.Arrays;

public class Solution {
    //
    public int getNumberOfK(int[] array, int k)
    {
        //
        if(array.length==0)
            return 0;
        if(Arrays.binarySearch(array,k)<0)
            return 0;
        //
        int begin=0;//included
        int end=0;  //excluded
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==k)
            {
                begin=i;
                break;
            }
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>k)
            {
                end=i;
                break;
            }
        }
        if(end==0)
            end=array.length;
        return end-begin;
    }
    //-------------------------------------//
    public static void main(String[] args)
    {
        int[] array={1,2,2,3,3,3,4,4,4,4};
        Solution s= new Solution();
        System.out.println(s.getNumberOfK(array,3));
    }
}
