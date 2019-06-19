package FindFirstCommonNode;

public class Solution {
    //
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2)
    {
        //
        if(pHead1==null||pHead2==null)//如果至少一个链表是空链表，则没有公共结点
            return null;
        if(pHead1==pHead2)//
            return pHead1;
        //
        ListNode commonHead= null;
        ListNode list2Head=pHead2;
        while(pHead1!=null)
        {
            while(pHead2!=null)
            {
                if(pHead2==pHead1)
                {
                    commonHead=pHead1;
                    return commonHead;
                }
                else
                    pHead2=pHead2.next;
            }
            pHead2=list2Head;
            pHead1=pHead1.next;
        }
        return null;
    }
    private class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val=val;
        }
    }
    //----------------------------------//
    public static void main(String[] args)
    {
        //
        Solution s= new Solution();
        ListNode ln1= s.new ListNode(1);
        ListNode ln2= s.new ListNode(2);
        ListNode ln3= s.new ListNode(3);
        ListNode ln4= s.new ListNode(4);
        ListNode ln5= s.new ListNode(5);
        ListNode ln6= s.new ListNode(6);
        ListNode ln7= s.new ListNode(7);
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln6;
        ln6.next=ln7;
        ln4.next=ln6;
        ListNode commonNode= s.findFirstCommonNode(ln1, ln4);
        while(commonNode!=null){
            System.out.print(commonNode.val+" ");
            commonNode=commonNode.next;
        }
    }
}
