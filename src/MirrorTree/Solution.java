package MirrorTree;
public class Solution {
    public void mirrorTree(TreeNode root)
    {
        //递归实现
        if(root==null)
            return ;
        mirrorTree(root.left);
        mirrorTree(root.right);
        TreeNode temp;
        temp=root.right;
        root.right=root.left;
        root.left=temp;
        // return ;
    }
    private class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val=val;
        }
    }
}
