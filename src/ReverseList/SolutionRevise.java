package ReverseList;
public class SolutionRevise //
{
    //
    public ListNode reverseList(ListNode head)
    {
        //
        if(head==null)
            return null;
        ListNode currentNode= head; //遍历一次链表
        ListNode currentNodesNext= null; //当前遍历指针的下一个节点
        ListNode currentNodesPre= null;  //当前遍历指针的上一个节点
        while(currentNode!=null)
        {
            currentNodesNext= currentNode.next;
            currentNode.next= currentNodesPre;
            currentNodesPre= currentNode;
            currentNode=currentNodesNext;
        }
        return currentNodesPre;
    }
    public class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val= val;
        }
    }
}
