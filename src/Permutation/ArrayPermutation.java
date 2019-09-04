package Permutation;
//程序编写注意要点：当数组或列表等数据结构的元素类型是int型时，通常需要格外注意index索引与element元素的区别
public class ArrayPermutation //
{
    //fullSort()递归实现
    //首位置的排列与其他位置的全排列
    public void fullSort(int[] array, int start, int end)// int start, int end: 数组索引
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
                //在start索引处选定待排列的元素, 将该元素放置在start索引位置上;
                swap(array, i, start);
                fullSort(array, start+1, end);
                swap(array, i, start);
            }
        }
    }
    private void swap(int[] arr, int i, int j) //int i, int j: 数组索引
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
