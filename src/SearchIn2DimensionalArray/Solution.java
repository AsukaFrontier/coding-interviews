package SearchIn2DimensionalArray;
public class Solution {
    public boolean find(int target, int [][] array)
    {
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array[0].length;j++)
                if(array[i][j]==target)
                    return true;
        return false;
    }
}
