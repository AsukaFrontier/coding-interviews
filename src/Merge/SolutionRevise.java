package Merge;
public class SolutionRevise //
{
    //
    public ListNode merge(ListNode list1,ListNode list2)
    {
        //
        if(list1==null&&list2==null)
            return null;
        if(list1==null&&list2!=null)
            return list2;
        if(list1!=null&&list2==null)
            return list1;
        // else: list1!=null&&list2!=null
        ListNode mergedHead;
        if(list1.val<=list2.val)
        {
            mergedHead= list1;
            list1= list1.next;
        }
        else
        {
            mergedHead= list2;
            list2= list2.next;
        }
        ListNode listHead= mergedHead;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                mergedHead.next= list1;
                list1=list1.next;
                mergedHead= mergedHead.next;
            }
            else
            {
                mergedHead.next= list2;
                list2= list2.next;
                mergedHead= mergedHead.next;
            }
        }
        if(list1==null)
            mergedHead.next= list2;
        else if(list2==null)
            mergedHead.next= list1;
        return listHead;
    }
    public class ListNode
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
        SolutionRevise s= new SolutionRevise();
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
