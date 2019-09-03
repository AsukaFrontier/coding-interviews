package VerifySequenceOfBST;
public class SolutionRevise //
{
    public boolean verifySequenceOfBST(int[] sequence)
    {
        if(sequence.length==0)
            return false;
        return verifySequenceOfBST(sequence, 0, sequence.length-1);
    }
    private boolean verifySequenceOfBST(int[] sequence, int leftIndexOfTree, int rightIndexOfTree)
    {
       int rootVal= sequence[rightIndexOfTree];
       int leftIndex= leftIndexOfTree;
       int rightIndex= rightIndexOfTree;
       while(sequence[leftIndex]<rootVal) //直到在数组中找到一个元素, 该元素不比根结点元素值更小, 则该元素之后都是根结点的右子树
           leftIndex++;
       int dividedSubTree= leftIndex; //数组中右子树的第一个元素
       while(leftIndex<=rightIndex)
       {
           if(sequence[leftIndex]<rootVal) //按照数组给定的顺序, 若右子树中存在比根结点元素更小的值, 则该数组顺序不是后序遍历顺序
               return false;
           leftIndex++;
       }
       //递归实现
       if(dividedSubTree!=leftIndexOfTree&&!verifySequenceOfBST(sequence, leftIndexOfTree, dividedSubTree-1)) //若存在左子树且左子树不能构成BST, 则该树不能构成BST
           return false;
       if(dividedSubTree!=rightIndexOfTree&&!verifySequenceOfBST(sequence, dividedSubTree, rightIndexOfTree-1)) //若存在右子树且右子树不能构成BST, 则该树不能构成BST
           return false;
       return true;
    }
    /**
    //-------------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        SolutionRevise sRevise= new SolutionRevise();
        int[] sequence= {1,3,4,2,7,8,6,5};
        if(sRevise.verifySequenceOfBST(sequence))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
     */
}
