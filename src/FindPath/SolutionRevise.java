package FindPath;
import java.util.ArrayList;
public class SolutionRevise //
{
    ArrayList<ArrayList<Integer>> allPaths= new ArrayList<>();
    ArrayList<ArrayList<Integer>> selectedPaths= new ArrayList<>();
    ArrayList<ArrayList<Integer>> sortedPaths= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target)
    {
        if(root==null)
            return sortedPaths;
    }
    private ArrayList<ArrayList<Integer>> findAllPaths(TreeNode root)
    {
        //
    }
    private ArrayList<ArrayList<Integer>> selectPaths(ArrayList<ArrayList<Integer>> allPaths)
    {
        //
    }
    private ArrayList<ArrayList<Integer>> sortPaths(ArrayList<ArrayList<Integer>> selectedPaths)
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
}
