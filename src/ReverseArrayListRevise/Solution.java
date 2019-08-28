package ReverseArrayListRevise;
import java.util.ArrayList;
import java.util.Stack;
public class Solution
{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        return reverseArrayList(browseArrayListToStack(listNode));
    }
    private Stack<Integer> browseArrayListToStack(ListNode listNode)
    {
        //将listNode中的元素存储到一个栈中
        Stack<Integer> stack= new Stack<Integer>();
        if(listNode==null)
            return stack;
        while(listNode.next!=null)
        {
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        stack.push(listNode.val);
        return stack;
    }
    private ArrayList<Integer> reverseArrayList(Stack<Integer> stack)
    {
        //将栈中元素依次pop到arrayList中
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        if(stack.isEmpty())
            return arrayList;
        while(!stack.isEmpty())
        {
            arrayList.add(stack.peek());
            stack.pop();
        }
        return arrayList;
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
    //---------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        Solution s=new Solution();
        ListNode listNode=s.new ListNode(67);
        ListNode listNode2=s.new ListNode(0);
        ListNode listNode3=s.new ListNode(24);
        ListNode listNode4=s.new ListNode(58);
        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        //listNode=null;
        ArrayList<Integer> al=s.printListFromTailToHead(listNode);
        for(Integer i: al)
            System.out.println(i);
    }
}
