package PrintMatrix;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix)
    {
        if(matrix.length==0||matrix[0].length==0)//Special circumstance;
            return null;
        ArrayList<Integer> ints= new ArrayList<>();
        while(matrix!=null)
        {
            for(int j=0;j<matrix[0].length;j++)
                ints.add(matrix[0][j]);
            matrix=deleteFirstRow(matrix);
            matrix=turnMatrixLeft(matrix);
        }
        return ints;
    }
    private int[][] deleteFirstRow(int[][] matrix)
    {
        if(matrix.length==0||matrix[0].length==0)
            return null;
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] new_matrix=new int[row-1][col];
        for(int i=0;i<row-1;i++)
            new_matrix[i]=matrix[i+1];
        return new_matrix;
    }
    private int[][] turnMatrixLeft(int[][] matrix)
    {
        if(matrix.length==0||matrix[0].length==0)
            return null;
        int row=matrix.length;//row
        int col=matrix[0].length;//column
        int[][] new_matrix= new int[col][row];//new matrix
        for(int i=0;i<row;i++)//each row, turn it left;
        {
            int[] row_old_matrix=new int[col];//each old row has 'col' element/elements;
            for(int j=0;j<col;j++)//column
                row_old_matrix[j]=matrix[i][j];
            for(int k=col-1,j=0;k>=0&&j<col;k--,j++)
                new_matrix[k][i]=row_old_matrix[j];
        }
        return new_matrix;
    }
    /**
    private void printBlockMatrix(int[][] matrix)
    {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.printf("%2d ",matrix[i][j]);
            System.out.println();
        }
    }
     */
    //-----------------------UNIT TEST---------------------//
    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        Solution s= new Solution();
        //
        /**
        s.printBlockMatrix(matrix);
        System.out.println();
        //
        int[][] delete_matrix=s.deleteFirstRow(matrix);
        s.printBlockMatrix(delete_matrix);
        System.out.println();
        //
        int[][] turn_left_matrix=s.turnMatrixLeft(delete_matrix);
        s.printBlockMatrix(turn_left_matrix);
        System.out.println();
         */
        ArrayList<Integer> al;
        al=s.printMatrix(matrix);
        for(Integer i: al)
            System.out.print(i+" ");
    }
}
