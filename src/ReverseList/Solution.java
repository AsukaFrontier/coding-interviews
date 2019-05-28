package ReverseList;

public class Solution {
    public ListNode reverseList(ListNode head)
    {
        //
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
        ListNode ln1=s.new ListNode(0);
        ListNode ln2=s.new ListNode(1);
        ListNode ln3=s.new ListNode(2);
        ListNode ln4=s.new ListNode(3);
        ListNode ln5=s.new ListNode(4);
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln4;
        ln4.next=ln5;
    }
}
