package IsPopOrder;
import java.util.Stack;
public class Solution//
{
    public boolean isPopOrder(int[] pushA, int[] popA)
    {
        Stack<Integer> stack = new Stack<>();
        int index_pushA=0;
        int index_popA=0;
        while(index_popA<popA.length)
        {
            //
            while(stack.isEmpty()||stack.peek()!=popA[index_popA])
            {
                if(index_pushA>=pushA.length)
                    return false;
                stack.push(pushA[index_pushA]);
                index_pushA++;
            }
            stack.pop();
            index_popA++;
        }
        return true;
    }
    //----------UNIT TEST------------//
    public static void main(String[] args)
    {
        //
        int[] pushA={1,2,3,4,5};
        int[] popA= {4,5,3,1,2};
        Solution s= new Solution();
        if(s.isPopOrder(pushA, popA))
            System.out.println("True.");
        else
            System.out.println("False.");
    }
}
