package Permutation;
public class ArrayPermutation //
{
    //fullSort()递归实现
    public void fullSort(int[] array, int start, int end)
    {
        if(start==end)
        {
            //
            for(int i: array)
            {
                System.out.print(i);
            }
            System.out.println();
            return ;
        }
        else
        {
            //
            for(int i= start; i<=end; i++)
            {
                //
                swap(array, i, start);
                fullSort(array, start+1, end);
                swap(array, i, start);
            }
        }
    }
    private void swap(int[] arr, int i, int j)
    {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args)
    {
        int[] array= {1,2,3,4};
        ArrayPermutation aP= new ArrayPermutation();
        aP.fullSort(array, 0, array.length-1);
    }
}
