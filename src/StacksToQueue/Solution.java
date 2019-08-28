package StacksToQueue;
import java.util.Stack;
public class Solution {
    Stack<Integer> stack1= new Stack<Integer>();
    Stack<Integer> stack2= new Stack<Integer>();
    //栈: 后进先出
    public void push(int i) //以队列的逻辑push: 先进先出
    {
        //enqueue
        stack1.push(i);
    }
    public int pop()//以队列的逻辑pop: 先进先出
    {
        //dequeue
        stack2queue();
        return stack2.pop();
    }
    private void stack2queue() //将stack1全部pop到stack2中
    {
        //
        while(stack2.isEmpty())//起到缓存的作用: stack2中的元素顺序与队列顺序相符, 当需要队列出操作时, 直接从stack2中作栈出操作, stack2空时再将stack1中元素pop进去;
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
