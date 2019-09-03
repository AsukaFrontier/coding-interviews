package StackMin;
//import java.util.Stack; //该集合类可被LinkedList, ArrayDeque替代
import java.util.LinkedList;
public class SolutionRevise //
{
    LinkedList<Integer> standardStack= new LinkedList<>();
    LinkedList<Integer> minElementStack= new LinkedList<>();
    int minElement= Integer.MAX_VALUE;
    public void push(int node) //向栈添加一个元素
    {
        standardStack.push(node);
        if(node<=minElement)
        {
            minElementStack.push(node);
            minElement= node;
        }
    }
    public void pop() //删除栈的顶部元素
    {
        int deletedFromStandardStack= standardStack.pop();
        if(deletedFromStandardStack==minElement)
            minElementStack.pop();
    }
    public int top() //返回栈的顶部元素, 但不删除该元素: 相当于Stack.peek()
    {
        return standardStack.peek();
    }
    public int min() //返回栈中所含元素的最小元素, 要求该函数的时间复杂度O(1)
    {
        return minElementStack.peek();
    }
}
