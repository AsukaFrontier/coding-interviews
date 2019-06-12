package FindGreatestSumOfSubArray;

public class Solution
{
    //
    public int findGreatestSumOfSubArray(int[] array)
    {
        int array_length= array.length;
        int max_value=Integer.MIN_VALUE;
        for(int i=1;i<=array_length;i++)//步进1--8
        {
            for(int j=0;j<=array_length-i;j++)//每个步进，依次从左至右加和
            {
                //
                int sum=0;
                for(int k=0;k<=i-1;k++)
                    sum=sum+array[j+k];
                if(sum>max_value)
                    max_value=sum;
            }
        }
        return max_value;
    }
    //------UNIT TEST-----//
    public static void main(String[] args)
    {
        int[] array= {6,-3,-2,7,-15,1,2,2};
        Solution s= new Solution();
        System.out.println(s.findGreatestSumOfSubArray(array));
    }
}
