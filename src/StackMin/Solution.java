package StackMin;
import java.util.Arrays;
public class Solution //
{
    int[] array= new int[99];
    int array_index;
    public void push(int node)
    {
        array[array_index]=node;
        array_index++;
    }
    public void pop()
    {
        array_index--;
        array[array_index]=Integer.MAX_VALUE;
    }
    public int top()
    {
        int temp= array[--array_index];
        array_index++;
        return temp;
    }
    public int min()//Time Complexity: O(1)
    {
        return arraySort(array)[0];
    }
    private int[] arraySort(int[] array)
    {
        int[] new_array= new int[array_index];
        for(int i=0;i<array_index;i++)
            new_array[i]=array[i];
        Arrays.sort(new_array);
        //Java中Arrays.sort()静态函数使用的是归并排序或快速排序, 对于基本数据类型使用(三向切分的)快速排序, 对于类的对象使用归并排序
        //因此, arraySort(int[] array)函数的时间复杂度不为O(1)
        return new_array;
    }
    //----------UNIT TEST---------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        s.push(3);
        System.out.println(s.min());
        s.push(4);
        System.out.println(s.min());
        s.push(2);
        System.out.println(s.min());
        s.push(3);
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.push(0);
        System.out.println(s.min());
    }
}
