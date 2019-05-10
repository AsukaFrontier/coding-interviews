package ReverseArrayList;

import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        return reverseArrayList(browseListNode(listNode));
    }
    private static ArrayList<Integer> browseListNode(ListNode listNode)
    {
        ArrayList<Integer> al_Int=new ArrayList<Integer>();
        if(listNode==null)
            return al_Int;
        while(listNode.next!=null)
        {
            al_Int.add(listNode.val);
            listNode=listNode.next;
        }
        al_Int.add(listNode.val);
        return al_Int;
    }
    private static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrayList)
    {
        for(int i=0;i<arrayList.size()/2;i++)
        {
            int temp;
            temp=arrayList.get(i);
            arrayList.set(i,arrayList.get((arrayList.size()-1)-i));
            arrayList.set(arrayList.size()-1-i,temp);
        }
        return arrayList;
    }
    private static class ListNode
    {
        int val;
        ListNode next= null;
        ListNode(int i)
        {
            this.val=i;
        }
    }
    //------------------------------------------//
    public static void main(String[] args)
    {
        //Solution sol=new Solution();
        ListNode listNode=new ListNode(67);
        ListNode listNode2=new ListNode(0);
        ListNode listNode3=new ListNode(24);
        ListNode listNode4=new ListNode(58);
        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        //listNode=null;
        ArrayList<Integer> al=printListFromTailToHead(listNode);
        for(Integer i: al)
            System.out.println(i);
    }
}
