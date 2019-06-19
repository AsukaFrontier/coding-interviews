package InversePairs;

public class Solution {
    public int inversePairs(int[] array)
    {
        int pairsCount= inversePair(array);
        return pairsCount%1_000_000_007;
    }
    private int inversePair(int[] arr)
    {
        int pairsCount=0;
        for(int i=0;i<arr.length-1;i++)//数组的最后一个元素，其没有更后面的元素
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }
    //--------------------------------------------//
    public static void main(String[] args)
    {
        int[] arr= {1,2,3,4,5,6,7,0};
        Solution s= new Solution();
        System.out.println(s.inversePairs(arr));
    }
}
