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
        //
        return ints;
    }
    private int[][] turnMatrixLeft(int[][] matrix)
    {
        int[][] new_matrix= new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            int[] row_old_matrix=new int[matrix[0].length];
            for(int j=0;j<matrix[0].length;j++)
            {
                //
                row_old_matrix[j]=matrix[i][j];
            }
        }
        //
        return matrix;
    }
    private void printBlockMatrix(int[][] matrix)
    {
        //
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.printf("%2d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
    //----------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Solution s= new Solution();
        s.printBlockMatrix(matrix);
    }
}
