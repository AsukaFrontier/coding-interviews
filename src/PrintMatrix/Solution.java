package PrintMatrix;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix)
    {
        if(matrix.length==0||matrix[0].length==0) //row= matrix.length; col= matrix[0].length
            return null;
        ArrayList<Integer> ints= new ArrayList<>(); //函数待返回的ArrayList变量
        while(matrix!=null) //matrix变量指向一个二维数组(输入参数)
        {
            for(int j=0;j<matrix[0].length;j++) //读取matrix数组第一行的所有列元素
                ints.add(matrix[0][j]);
            matrix=deleteFirstRow(matrix); //删除数组的第一行元素(二维数组的第一个一维数组元素)
            matrix=turnMatrixLeft(matrix); //将数组向左旋转, 使得函数能够顺时针读取;
        }
        return ints;
    }
    private int[][] deleteFirstRow(int[][] matrix)
    {
        if(matrix.length==0||matrix[0].length==0)
            return null;
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] newMatrix=new int[row-1][col];
        for(int i=0;i<row-1;i++)
            newMatrix[i]=matrix[i+1];
        return newMatrix;
    }
    private int[][] turnMatrixLeft(int[][] matrix)
    {
        if(matrix.length==0||matrix[0].length==0)
            return null;
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] newMatrix= new int[col][row];
        for(int i=0;i<row;i++)//each row, turn it left;
        {
            int[] row_old_matrix=new int[col]; //暂存旧矩阵的每行(each old row has 'col' element/elements;)
            for(int j=0;j<col;j++) //将当前行的列元素暂存到row_old_matrix
                row_old_matrix[j]=matrix[i][j];
            for(int k=col-1,j=0;k>=0&&j<col;k--,j++) //将行元素逆时针旋转为列元素
                newMatrix[k][i]=row_old_matrix[j];
        }
        return newMatrix;
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
