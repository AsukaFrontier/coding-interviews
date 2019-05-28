package ReverseList;
public class Solution {
    public ListNode reverseList(ListNode head)
    {
        if(head==null)
            return null;
        ListNode tail=findTheTailOfList(head);
        ListNode head_of_list=head;//constant pointer pointing at head of the list
        ListNode tail_of_list=tail;//constant pointer pointing at tail of the list
        while(tail!=head_of_list)
        {
            tail.next=findBeforeTheElement(head,tail);
            tail=tail.next;
            tail.next=null;
        }
        return tail_of_list;
    }
    private ListNode findBeforeTheElement(ListNode head, ListNode element)
    {
        //
        while(head.next!=element)
            head=head.next;
        return head;
    }
    private ListNode findTheTailOfList(ListNode head)
    {
        ListNode tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        return tail;
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
    //-----------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        //
        Solution s= new Solution();
        ListNode ln1=s.new ListNode(1);
        ListNode ln2=s.new ListNode(2);
        ListNode ln3=s.new ListNode(3);
        ListNode ln4=s.new ListNode(4);
        ListNode ln5=s.new ListNode(5);
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln4;
        ln4.next=ln5;
        ListNode ln=s.reverseList(ln1);
        while(ln!=null)
        {
            System.out.print(ln.val+" ");
            ln=ln.next;
        }
    }
}
