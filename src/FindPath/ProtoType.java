package FindPath;
import java.util.ArrayList;
public class ProtoType //
{
    private ArrayList<Integer> aListInts= new ArrayList<>();
    public void depthFirstVisit(TreeNode root) //深度优先遍历
    {
        if(root==null)
            return ;
        aListInts.add(root.val);
        depthFirstVisit(root.left);
        depthFirstVisit(root.right);
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
    //--------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        ProtoType s= new ProtoType();
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
        s.depthFirstVisit(tn0);
        for(int i=0;i<s.aListInts.size();i++)
            System.out.print(s.aListInts.get(i)+" ");
    }
}
