package IsPopOrder;
import java.util.LinkedList;
public class Solution //
{
    public boolean isPopOrder(int[] pushA, int[] popA)
    {
        LinkedList<Integer> auxilliaryStack = new LinkedList<>(); //辅助栈
        //迭代数组popA, 按照入栈顺序将pushA中元素压入辅助栈中(包括popA对应的元素)
        //出栈数组popA中的某元素对应着入栈数组pushA的元素, 其(pushA中元素)左边的所有元素都应已入栈
        int index_pushA=0;
        int index_popA=0;
        while(index_popA<popA.length) //迭代数组popA
        {
            //对于一个正确的入栈出栈顺序, 若辅助栈栈首元素与popA数组当前元素不符时, 应当继续入栈, 直到相符(这是合理出栈顺序所对应的逻辑)
            while(auxilliaryStack.isEmpty()||auxilliaryStack.peek()!=popA[index_popA])
            {
                if(index_pushA>=pushA.length) //即已经按照pushA数组提供的顺序将元素都压入栈中, 但仍不符合
                    return false;
                auxilliaryStack.push(pushA[index_pushA]);
                index_pushA++;
            }
            //当辅助栈中的栈首元素与当前popA[index_popA]相同时, 意味着该元素需要出栈操作(才能在popA数组中出现)
            auxilliaryStack.pop();
            index_popA++;
        }
        return true;
    }
    /**
    //--------------UNIT TEST----------------//
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
     */
}
