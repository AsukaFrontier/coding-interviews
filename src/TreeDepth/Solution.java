package TreeDepth;
import java.util.ArrayList;
public class Solution {
    //
    public int treeDepth(TreeNode root)
    {
        //
        if(root==null)
            return 0;
        //
        int depthCount= 0;
        ArrayList<Integer> aList= new ArrayList<>();
        depthFirstVisit(root, depthCount, aList);
        int maxDepth= Integer.MIN_VALUE;
        for(int i: aList)
        {
            if(i>maxDepth)
                maxDepth=i;
        }
        return maxDepth;
    }
    private void depthFirstVisit(TreeNode root, int depthCount, ArrayList<Integer> aList)
    {
        //
        if(root==null)
            return ;
        depthCount++;
        if(isLeafNode(root))
            aList.add(depthCount);
        depthFirstVisit(root.left, depthCount, aList);
        depthFirstVisit(root.right, depthCount, aList);
        depthCount--;
    }
    private boolean isLeafNode(TreeNode root)
    {
        if(root==null)
            return false;
        if(root.left==null&&root.right==null)//root非空且左右子树皆空
            return true;
        return false;
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
    //--------------UNIT TEST--------------//
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
        tn1.right=tn3;
        System.out.println(s.treeDepth(tn0));
    }
}
