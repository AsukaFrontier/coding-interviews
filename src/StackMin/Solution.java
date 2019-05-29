package StackMin;
import java.util.Arrays;
public class Solution {
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
