package StacksToQueue;
import java.util.Stack;
public class Solution {
    Stack<Integer> stack1= new Stack<Integer>();
    Stack<Integer> stack2= new Stack<Integer>();

    public void push(int node)
    {
        //enqueue
        stack1.push(node);
    }
    public int pop()
    {
        //dequeue
        stack2queue();
        return stack2.pop();
    }
    private void stack2queue()
    {
        //
        while(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
    }
    //-------UNIT TEST----------------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(4);
        System.out.println(s.pop());
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
