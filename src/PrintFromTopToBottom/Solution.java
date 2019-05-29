package PrintFromTopToBottom;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root)
    {
        //
    }
    private class TreeNode
    {
        int val=0;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val=val;
        }
    }
    //---UNIT TEST-----//
    public static void main(String[] args)
    {
        //
        Solution s= new Solution();
        TreeNode tn0= s.new TreeNode(0);
        TreeNode tn1= s.new TreeNode(1);
        TreeNode tn2= s.new TreeNode(2);
        TreeNode tn3= s.new TreeNode(3);
        tn0.left=tn1;
        tn0.right=tn2;
        tn1.left=tn3;
    }
}
