package Multiply;
import java.util.ArrayList;
public class Solution //
{
    //
    public int[] multiply(int[] aArray)
    {
        //
        int[] bArray= new int[aArray.length];
        for(int i=0;i<bArray.length;i++)
        {
            //
            int multipliedNumber= 1;
            for(int j=0;j<aArray.length;j++)
            {
                if(j==i)
                    continue;
                multipliedNumber= multipliedNumber*aArray[j];
            }
            bArray[i]= multipliedNumber;
        }
        //
        return bArray;
    }
}
