package SearchIn2DimensionalArray;

public class Solution {
    public boolean Find(int target, int [][] array)
    {
        //
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array[0].length;j++)
                if(array[i][j]==target)
                    return true;
        return false;
    }
    //---------------------------------------------------//
    public static void main(String[] args)
    {
        //
        int[] [] array_2D={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        int target=5;
        Solution s= new Solution();
        if(s.Find(target,array_2D))
            System.out.println("Contains.");
        else
            System.out.println("Not contains.");
    }
}
