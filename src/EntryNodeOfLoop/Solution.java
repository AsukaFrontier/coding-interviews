package EntryNodeOfLoop;
import java.util.ArrayList;
//
public class Solution //
{
    //
    ArrayList<ListNode> aListNode= new ArrayList<>();
    public ListNode entryNodeOfLoop(ListNode pHead)
    {
        ListNode currentNode= pHead;
        while(currentNode!=null||(!existsNode(currentNode)))
        {
            aListNode.add(currentNode);
            currentNode= currentNode.next;
        }
        return currentNode;
    }
    private boolean existsNode(ListNode node)
    {
        //
        for(int i=0;i<aListNode.size();i++)
        {
            if(node == aListNode.get(i))
            {
                return true;
            }
        }
        return false;
    }
    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val= val;
        }
    }
}
