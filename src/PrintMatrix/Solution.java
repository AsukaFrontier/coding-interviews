package PrintMatrix;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix)
    {
        //Special circumstance;
        if(matrix.length==0)
            return null;
        if(matrix[0].length==0)
            return null;
        //
        ArrayList<Integer> ints= new ArrayList<>();
        return ints;
    }
    private void printBlockMatrix(int[][] matrix)
    {
        //
        int row=matrix.length;
        int col=matrix[0].length;
    }
    //----------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    }
}
