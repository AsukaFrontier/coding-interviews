package FindPath;
import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target)
    {
        ArrayList<Integer> node_path= new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> node_paths= new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> target_node_paths= new ArrayList<ArrayList<Integer>>();
        //
        if(root==null)
            return target_node_paths;
        //
        depthFirstSearch(root, node_path, node_paths);
        targetPaths(root, target, node_paths, target_node_paths);
        //
        return target_node_paths;
    }
    private void targetPaths(TreeNode root, int target, ArrayList<ArrayList<Integer>> node_paths, ArrayList<ArrayList<Integer>> target_node_paths)
    {
        //
        for(ArrayList<Integer> aList: node_paths)
        {
            int sum=0;
            for(int i: aList)
                sum=sum+i;
            if(sum==target)
                target_node_paths.add(aList);
        }
    }
    private void depthFirstSearch(TreeNode root, ArrayList<Integer> node_path, ArrayList<ArrayList<Integer>> node_paths)
    {
        node_path.add(root.val);
        if(root.left==null&&root.right==null)
        {
            ArrayList<Integer> node_path_copy= new ArrayList<Integer>();
            node_paths.add((ArrayList<Integer>) node_path.clone());
        }
        if(root.left!=null)
            depthFirstSearch(root.left, node_path, node_paths);
        if(root.right!=null)
            depthFirstSearch(root.right, node_path, node_paths);
        node_path.remove(node_path.size()-1);
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
        ArrayList<ArrayList<Integer>> paths= new ArrayList<ArrayList<Integer>>();
        paths= s.findPath(tn0, 11);
        for(ArrayList<Integer> al: paths)
        {
            for(int i: al)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
