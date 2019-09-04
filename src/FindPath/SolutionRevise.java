package FindPath;
import java.util.ArrayList;
public class SolutionRevise //
{
    private ArrayList<ArrayList<Integer>> allPaths= new ArrayList<>();
    private ArrayList<ArrayList<Integer>> selectedPaths= new ArrayList<>();
    private ArrayList<ArrayList<Integer>> sortedPaths= new ArrayList<>();
    //一个辅助数组, 记录访问以来的结点路径
    private ArrayList<Integer> nodeVisited= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) //Main
    {
        if(root==null) //若树为空
            return sortedPaths;
        findAllPaths(root);
        selectPaths(target);
        return selectedPaths;
    }
    private void findAllPaths(TreeNode root) //找出所有叶子节点对应的路径
    {
        //DepthFirstSearch algorithm;
        if(root==null)
            return ;
        //if(root!=null):
        nodeVisited.add(root.val); //将访问的结点加入队列中
        if(root.left==null&&root.right==null) //当前节点是叶子节点, 将路径生成
            allPaths.add(addPaths());
        findAllPaths(root.left);
        findAllPaths(root.right);
        //删除数组路径的尾元素
        nodeVisited.remove(nodeVisited.size()-1);
    }
    private void selectPaths(int target)
    {
        for(ArrayList<Integer> eachPath: allPaths)
        {
            int sumOfEachPath= 0;
            for(int element: eachPath)
                sumOfEachPath=sumOfEachPath+element;
            if(sumOfEachPath==target)
                selectedPaths.add(eachPath);
        }
    }
    private void sortPaths()
    {
        //
    }
    private ArrayList<Integer> addPaths() //将当前队列中的元素放入一个新生成的ArrayList中
    {
        ArrayList<Integer> aListInts= new ArrayList<>();
        for(int i: nodeVisited)
            aListInts.add(i);
        return aListInts;
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
    /**
    //--------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        SolutionRevise s= new SolutionRevise();
        TreeNode tn10=s.new TreeNode(10);
        TreeNode tn5=s.new TreeNode(5);
        TreeNode tn12=s.new TreeNode(12);
        TreeNode tn4=s.new TreeNode(4);
        TreeNode tn7=s.new TreeNode(7);
        tn10.left= tn5;
        tn10.right= tn12;
        tn5.left=tn4;
        tn5.right= tn7;
        ArrayList<ArrayList<Integer>> paths= new ArrayList<ArrayList<Integer>>();
        paths= s.findPath(tn10, 22);
        for(ArrayList<Integer> al: paths)
        {
            for(int i: al)
                System.out.print(i+" ");
            System.out.println();
        }
    }
     */
}
