package Merge;
public class Solution {
    public ListNode merge(ListNode list1, ListNode list2)
    {
        ListNode head_of_list1=list1;//
        if(list1==null&&list2==null)
            return null;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
            {
                list1=list1.next;
            }
            else if(list1.val==list2.val)
            {
                ListNode swap_temp;//
                ListNode temp;
                temp=list2;//
                list2=list2.next;
                swap_temp=list1.next;//
                list1.next=temp;
                temp.next=swap_temp;
                list1=list1.next.next;
            }
            else//list1.val>list2.val
            {
                ListNode temp;//current list2
                ListNode before_list1= findBeforeTheElement(head_of_list1,list1);
                temp=list2;//
                list2=list2.next;
                before_list1.next=temp;//
                temp.next=list1;
            }
        }
        if(list1==null)
        {
            findBeforeTheElement(head_of_list1,list1).next=list2;
        }
        return head_of_list1;
    }
    private ListNode findBeforeTheElement(ListNode head, ListNode element)
    {
        //
        while(head.next!=element)
            head=head.next;
        return head;
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
    //-----------UNIT TEST---------//
    public static void main(String[] args)
    {
        //
        Solution s= new Solution();
        ListNode ln1=s.new ListNode(1);
        ListNode ln2=s.new ListNode(2);
        ListNode ln3=s.new ListNode(3);
        ListNode ln4=s.new ListNode(4);
        ListNode ln5=s.new ListNode(5);
        ListNode ln6=s.new ListNode(6);
        ln1.next=ln3;
        ln3.next=ln5;
        ln2.next=ln4;
        ln4.next=ln6;
        ListNode ln=s.merge(ln1,ln2);
        while(ln!=null)
        {
            System.out.print(ln.val+" ");
            ln=ln.next;
        }
    }
}
