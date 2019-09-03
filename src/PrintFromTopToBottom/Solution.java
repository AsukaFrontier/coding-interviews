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
    //--------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        /**
         *       0
         *     /  \
         *    1    2
         *   /
         *  3
         */
        Solution s= new Solution();
        TreeNode tn0= s.new TreeNode(0);
        TreeNode tn1= s.new TreeNode(1);
        TreeNode tn2= s.new TreeNode(2);
        TreeNode tn3= s.new TreeNode(3);
        tn0.left=tn1;
        tn0.right=tn2;
        tn1.left=tn3;
        //ArrayList<Integer> integers= s.printFromTopToBottom(tn0);
        ArrayList<Integer> integers= s.printFromTopToBottom(tn3.left);
        for(Integer i: integers)
            System.out.print(i+" ");
    }
}
