package ReConstructBinaryTreeRevise;
public class Solution
{
    //
    public TreeNode reConstructBinaryTree(int[] pre, int[] in)
    {
        return reConstructBinaryTree(pre, 0,pre.length-1, in, 0, in.length-1);
    }
    private TreeNode reConstructBinaryTree(int[] pre, int index_pre_left, int index_pre_right, int[] in, int index_in_left, int index_in_right)//递归调用reConstructBinaryTree()
    {
        if(index_pre_left>index_pre_right||index_in_left>index_in_right)//临界判定
            return null;
        TreeNode treeNode= new TreeNode(pre[index_pre_left]);//创建一个树结点, left=null, right=null;
        for(int i=index_in_left;i<=index_in_right;i++)
        {
            if(in[i]==pre[index_pre_left])//在中序序列中找到当前递归的根结点元素
            {
                treeNode.left=reConstructBinaryTree(pre,index_pre_left+1, index_pre_left+(i-index_in_left), in, index_in_left,i-1);
                treeNode.right=reConstructBinaryTree(pre, index_pre_left+(i-index_in_left)+1, index_pre_right, in, i+1, index_in_right);
            }
        }
        return treeNode;
    }
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val= val; }
    }
    //-----------------------UNIT TEST-------------------------//
    public static void main(String[] args)
    {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};

        Solution s= new Solution();
        System.out.println("PostOrder Test: ");
        s.postOrderTest();
        System.out.println();
        System.out.println("Main Test: ");
        TreeNode tree=s.reConstructBinaryTree(pre, in);
        s.postOrder(tree);
    }
    private void postOrder(TreeNode tn) {
        if(tn==null)
            return ;
        postOrder(tn.left);
        postOrder(tn.right);
        System.out.print(tn.val+" ");
    }
    private void postOrderTest()
    {
        TreeNode tn0=new TreeNode(0);
        TreeNode tn1=new TreeNode(1);
        TreeNode tn2=new TreeNode(2);
        tn0.left=tn1;
        tn0.right=tn2;
        postOrder(tn0);
    }
}
