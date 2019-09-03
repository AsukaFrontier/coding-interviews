package PrintFromTopToBottom;
import java.util.ArrayList;
import java.util.LinkedList;
public class Solution {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root)
    {
        ArrayList<Integer> integers= new ArrayList<>();
        LinkedList<TreeNode> queue= new LinkedList<TreeNode>();
        if(root==null)
            return integers;
        queue.add(root);//将根结点添加至队列
        while(!queue.isEmpty())
        {
            breadthFirstOrder(queue.getFirst(),integers, queue);
        }
        return integers;
    }
    private void breadthFirstOrder(TreeNode root, ArrayList<Integer> integers, LinkedList<TreeNode> queue)
    {
        queue.removeFirst();
        integers.add(root.val);
        if(root.left!=null)
            queue.add(root.left);
        if(root.right!=null)
            queue.add(root.right);
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
}
