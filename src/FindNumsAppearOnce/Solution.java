package FindNumsAppearOnce;
import java.util.ArrayList;
//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    //
    public void findNumsAppearOnce(int[] array, int[] num1, int[] num2)
    {
        boolean[] appearedElements= new boolean[array.length];
        for(int i=0;i<array.length-1;i++)
        {
            if(appearedElements[i])
                continue;
            for(int j=i+1;j<array.length;j++)
            {
                if(appearedElements[j])
                    continue;
                if(array[i]==array[j])
                {
                    appearedElements[i]=true;
                    appearedElements[j]=true;
                }
            }
        }
        ArrayList<Integer> aList= new ArrayList<>();
        for(int i=0;i<appearedElements.length;i++)
        {
            if(!appearedElements[i])
                aList.add(array[i]);
        }
        if(aList.size()!=2)
            System.out.println("Error");
        else
        {
            for(int i: aList)
                System.out.print(i+" ");
            System.out.println();
        }
        num1[0]=aList.get(0);
        num2[0]=aList.get(1);
    }
    //----------------------------------------------------//
    public static void main(String[] args)
    {
        int[] array= {1,2,2,3,3,3,4,4,5};
        int[] num1= new int[1];
        int[] num2= new int[1];
        Solution s= new Solution();
        s.findNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
