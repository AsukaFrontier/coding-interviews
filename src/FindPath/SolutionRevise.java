package FindPath;
import java.util.ArrayList;
import java.util.LinkedList;
public class SolutionRevise //
{
    private ArrayList<ArrayList<Integer>> allPaths= new ArrayList<>();
    private ArrayList<ArrayList<Integer>> selectedPaths= new ArrayList<>();
    private ArrayList<ArrayList<Integer>> sortedPaths= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target)
    {
        if(root==null)
            return sortedPaths;
    }
    private void findAllPaths(TreeNode root)
    {
        //
        LinkedList<Integer> queue= new LinkedList<>(); //Queue: add(), remove();
        queue.add(root.val);
        if(root.left==null&&root.right==null) //当前节点是叶子节点
        {
            allPaths.add(queueToArrayList(queue));
        }
    }
    private ArrayList<Integer> queueToArrayList(LinkedList<Integer> queue)
    {
        //
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
    //----------UNIT TEST----------//
    //          3
    //         / \
    //        1   2
    //           / \
    //          3   4
    //         /
    //        1
}
