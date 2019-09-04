package Convert;
public class Solution //
{
    TreeNode lastDLL; //双向链表的迭代指针
    TreeNode real_head;
    public TreeNode convert(TreeNode pRootOfTree)
    {
        convertSub(pRootOfTree);
        return real_head;
    }
    private void convertSub(TreeNode treeNode)//双向链表从左至右依次构建
    {
        //无返回值的递归实现
        if(treeNode==null)
            return ;
        //中序遍历
        convertSub(treeNode.left);
        if(lastDLL ==null) //此时应当遇到了树中的最小元素
        {
            lastDLL =treeNode;
            real_head=treeNode;//双向链表的头结点, 此后该指针不再变化
        }
        else //lastDLL!=null
        {
            lastDLL.right=treeNode;
            treeNode.left= lastDLL;
            lastDLL =treeNode;
        }
        convertSub(treeNode.right);
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
