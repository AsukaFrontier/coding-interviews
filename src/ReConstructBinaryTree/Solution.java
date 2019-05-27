package ReConstructBinaryTree;
import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in)
    {
        return reConstructBinaryTree(pre, 0,pre.length-1, in, 0, in.length-1);
    }
    private TreeNode reConstructBinaryTree(int[] pre, int pre_left, int pre_right, int[] in, int in_left, int in_right)
    {
        //
        if(pre_left>pre_right||in_left>in_right)
            return null;
        TreeNode tn= new TreeNode(pre[pre_left]);
        for(int i=in_left;i<=in_right;i++)
        {
            if(pre[pre_left]==in[i])
            {
                tn.left=reConstructBinaryTree(pre,pre_left+1,pre_left+(i-in_left),in,in_left,i-1);
                tn.right=reConstructBinaryTree(pre,pre_left+(i-in_left)+1,pre_right,in,i+1,in_right);
            }
        }
        return tn;
    }
    //---------------------------------------------------------//
    private class TreeNode//Definition for binary tree
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val=x;
        }
    }
    //-----------------------UNIT TEST-------------------------//
    public static void main(String[] args)
    {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};

        Solution s= new Solution();
        System.out.println("PostOrder Test: ");
        s.postOrderTest();
        System.out.println();
        System.out.println("Main Test: ");
        TreeNode tree=s.reConstructBinaryTree(pre, in);
        s.postOrder(tree);
    }
    private void postOrder(TreeNode tn) {
        if(tn==null)
            return ;
        postOrder(tn.left);
        postOrder(tn.right);
        System.out.print(tn.val+" ");
    }
    private void postOrderTest()
    {
        TreeNode tn0=new TreeNode(0);
        TreeNode tn1=new TreeNode(1);
        TreeNode tn2=new TreeNode(2);
        tn0.left=tn1;
        tn0.right=tn2;
        postOrder(tn0);
    }
}
