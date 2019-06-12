package Convert;

public class Solution {
    TreeNode head;
    TreeNode real_head;
    public TreeNode convert(TreeNode pRootOfTree)
    {
        convertSub(pRootOfTree);
        return real_head;
    }
    private void convertSub(TreeNode pRootOfTree)//双向链表从左至右依次构建
    {
        if(pRootOfTree==null)
            return ;
        //中序遍历
        convertSub(pRootOfTree.left);
        if(head==null)
        {
            head=pRootOfTree;
            real_head=pRootOfTree;//双向链表的头结点
        }
        else
        {
            head.right=pRootOfTree;
            pRootOfTree.left=head;
            head=pRootOfTree;
        }
        convertSub(pRootOfTree.right);
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
