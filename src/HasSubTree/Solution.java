package HasSubTree;
import java.util.ArrayList;
public class Solution //
{
    //TreeNode lst2InLst1; //By default, lst2InLst1=null;
    ArrayList<TreeNode> aList= new ArrayList<>();
    public boolean hasSubTree(TreeNode root1, TreeNode root2)
    {
        if(root1==null||root2==null) //若树为空，则不存在子结构关系
            return false;
        // 首先在root1中找到_所有_和root2根节点相同的节点;
        deepFirstSearch(root1, root2); //此后, aList中存在所有与root2根节点相同值的root1中的节点
        // 若存在, 继续判断root1对应节点是否和root2完全相同;
        for(int indexOfaList= 0; indexOfaList<aList.size();indexOfaList++)
            if(whetherPartiallyMatch(aList.get(indexOfaList), root2))
                return true;
        return false;
    }
    private void deepFirstSearch(TreeNode root1, TreeNode root2)//深度优先搜索, 在root1中寻找_所有_root2.val值对应的节点;
    {
        //递归实现
        if(root1==null)
            return ;
        if(root1.val==root2.val)
        {
            //lst2InLst1= root1;
            aList.add(root1);
        }
        deepFirstSearch(root1.left, root2);
        deepFirstSearch(root1.right, root2);
    }
    private boolean whetherPartiallyMatch(TreeNode root1, TreeNode root2) //判断root2的结构是否存在于root1中
    {
        if(root1.val!=root2.val)
            return false;
        if(root2.left!=null)
        {
            if(root1.left==null)
                return false;
            if(!whetherPartiallyMatch(root1.left, root2.left))
                return false;
        }
        if(root2.right!=null)
        {
            if(root1.right==null)
                return false;
            if(!whetherPartiallyMatch(root1.right, root2.right))
                return false;
        }
        return true;
    }
    /**
    private boolean whetherTotallyMatch(TreeNode root1, TreeNode root2)//判断两树的结构是否完全一致
    {
        //递归实现
        if((root1==null&&root2!=null)||(root1!=null&&root2==null))
            return false;
        if(root1==null&&root2==null)
            return true;
        if(root1.val!=root2.val)
            return false;
        if(!whetherTotallyMatch(root1.left, root2.left))
            return false;
        if(!whetherTotallyMatch(root1.right, root2.right))
            return false;
        return true;
    }
     */
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
    //-------------UNIT TEST-------//
    public static void main(String...args)
    {
        Solution s= new Solution();
        TreeNode tNode8l= s.new TreeNode(8);
        TreeNode tNode8ll= s.new TreeNode(8);
        TreeNode tNode9l= s.new TreeNode(9);
        TreeNode tNode2l= s.new TreeNode(2);
        TreeNode tNode5l= s.new TreeNode(5);

        TreeNode tNode8r= s.new TreeNode(8);
        TreeNode tNode9r= s.new TreeNode(9);
        TreeNode tNode3r= s.new TreeNode(3);
        TreeNode tNode2r= s.new TreeNode(2);

        tNode8l.right= tNode8ll;
        tNode8ll.right= tNode9l;
        tNode9l.right= tNode2l;
        tNode2l.right= tNode5l;

        tNode8r.right= tNode9r;
        tNode9r.left= tNode3r;
        tNode9r.right= tNode2r;

        if(s.hasSubTree(tNode8l, tNode8r))
            System.out.println("Has");
        else
            System.out.println("HAS NOT");
    }
}
