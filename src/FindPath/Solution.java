package FindPath;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target)
    {
        int[] weights= new int[treeSize(root)];
        boolean[] leafNodes= new boolean[treeSize(root)];
        treeToArrays(root, weights,leafNodes);
    }
    private void treeToArrays(TreeNode root, int[] weights, boolean[] leafNodes)
    {
        LinkedList<TreeNode> treeNodes= new LinkedList<>();
        treeNodes.add(root);
        int index=0;
        while(!treeNodes.isEmpty())
        {
            TreeNode tree= treeNodes.removeFirst();
            weights[index]=tree.val;
            if(tree.left==null&&tree.right==null)
                leafNodes[index]=true;
            //
            if(tree.left!=null)
                treeNodes.add(tree.left);
            if(tree.right!=null)
                treeNodes.add(tree.right);
            index++;
        }
    }
    private void setNodePaths(TreeNode root, int[] edgeTo)
    {
        boolean[] marked= new boolean[treeSize(root)];
    }
    private int treeSize(TreeNode root)
    {
        int size=0;
        LinkedList<TreeNode> tree= new LinkedList<TreeNode>();
        tree.add(root);
        while(!tree.isEmpty())
        {
            TreeNode head= tree.removeFirst();
            size++;//
            if(head.left!=null)
                tree.add(head.left);
            if(head.right!=null)
                tree.add(head.right);
        }
        return size;
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
        Solution s= new Solution();
        TreeNode tn0=s.new TreeNode(0);
        TreeNode tn1=s.new TreeNode(1);
        TreeNode tn2=s.new TreeNode(2);
        TreeNode tn3=s.new TreeNode(6);
        TreeNode tn4=s.new TreeNode(3);
        TreeNode tn5=s.new TreeNode(3);
        tn0.left=tn1;
        tn0.right=tn2;
        tn2.right=tn3;
        tn3.left=tn4;
        tn3.right=tn5;
    }
}
