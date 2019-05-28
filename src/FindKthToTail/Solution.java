package FindKthToTail;

public class Solution {
    public ListNode findKthToTail(ListNode head, int k)
    {
        //
        if(head==null)
            return null;
        int by_order_k= countOnList(head)-k+1;
        return findByOrderElement(head,by_order_k);
    }
    private int countOnList(ListNode head)
    {
        //
        int count= 0;
        while(head.next!=null)
        {
            count++;
            head=head.next;
        }
        count++;
        return count;
    }
    private ListNode findByOrderElement(ListNode head, int k)
    {
        int i=0;
        if(k<=0)
            return null;
        while(i<k-1)
        {
            head=head.next;
            i++;
        }
        return head;
    }
    private class ListNode
    {
        int val;
        ListNode next;
        ListNode(int value)
        {
            val=value;
        }
    }
    //-----------UNIT TEST---------//
    public static void main(String[] args)
    {
        //
        Solution s= new Solution();
        ListNode ln1=s.new ListNode(0);
        ListNode ln2=s.new ListNode(1);
        ListNode ln3=s.new ListNode(2);
        ListNode ln4=s.new ListNode(3);
        ListNode ln5=s.new ListNode(4);
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln4;
        ln4.next=ln5;
        System.out.println(s.countOnList(ln1));
        ListNode k_th_element= s.findKthToTail(ln1,6);
        System.out.println(k_th_element.val);
    }
}
