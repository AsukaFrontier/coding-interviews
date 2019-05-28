package ReOrderArray;

public class Solution {
    public void reOrderArray(int[] array)
    {
        int N= array.length;
        int[] re_order_array= new int[N];
        int r_index= 0;
        for(int i=0;i<N;i++)
        {
            if(array[i]%2==1)
            {
                re_order_array[r_index]=array[i];
                r_index++;
            }
        }
        for(int i=0;i<N;i++)
        {
            if(array[i]%2==0)
            {
                re_order_array[r_index]=array[i];
                r_index++;
            }
        }
        for(int j=0;j<N;j++)
            array[j]=re_order_array[j];
    }
    //---------------UNIT TEST-----------------//
    public static void main(String[] args)
    {
        //
        int[] ints= {1,2,3,4,5,6,7};
        Solution s = new Solution();
        s.reOrderArray(ints);
        for(Integer j: ints)
            System.out.print(j+" ");
    }
}
