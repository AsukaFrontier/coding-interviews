package MoreThanHalfNum;

import java.util.ArrayList;

public class Solution {
    //
    public int moreThanHalfNum(int[] array)
    {
        int array_length=array.length;
        ArrayList<Integer> aList= new ArrayList<Integer>();
        for(int i=0;i<array_length;i++)
        {
            if(aList.contains(array[i]))
                continue;
            else
                aList.add(array[i]);
        }
        int sum=0;
        int index=0;
        for(int j: aList)
        {
            for(int k=0;k<array_length;k++)
            {
                if(array[k]==j)
                    sum++;
            }
            if(sum>array_length/2)
            {
                index=j;
                return index;
            }
            else
                sum=0;
        }
        return index;
    }
    //------UNIT TEST---------//
    public static void main(String[] args)
    {
        int[] array= {1,2,3,2,2,2,5,4,2};
        Solution s= new Solution();
        System.out.println(s.moreThanHalfNum(array));
    }
}
