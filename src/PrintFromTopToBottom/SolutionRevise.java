package PrintFromTopToBottom;
import java.util.ArrayList;
import java.util.LinkedList; //Queue: add(), remove()
//从上往下, 从左往右依次打印二叉树的每个结点: 广度优先遍历BreadthFirstSearch
//广度优先搜索: 借助一个辅助队列, 将当前结点的两个子节点(if exists)(left first, right second)入队;
//再按照队列中元素顺序递归访问
//广度优先搜索, 不能使用递归实现, 可以迭代实现
public class SolutionRevise //
{
    LinkedList<TreeNode> aListTreeNode= new LinkedList<>();
    ArrayList<Integer> aListInt= new ArrayList<>();
    public ArrayList<Integer> printFromTopToBottom(TreeNode root)
    {
        if(root==null)
            return aListInt;
        //root!=null
        breadthFirstVisit(root);
        return aListInt;
    }
    private void breadthFirstVisit(TreeNode root) //广度优先搜索, 需要一个辅助队列
    {
        aListTreeNode.add(root);
        while(!aListTreeNode.isEmpty())
        {
            TreeNode aListTreeNodeRemoved= aListTreeNode.remove();
            aListInt.add(aListTreeNodeRemoved.val);
            if(aListTreeNodeRemoved.left!=null)
                aListTreeNode.add(aListTreeNodeRemoved.left);
            if(aListTreeNodeRemoved.right!=null)
                aListTreeNode.add(aListTreeNodeRemoved.right);
        }
    }
    private class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val= val;
        }
    }
}
