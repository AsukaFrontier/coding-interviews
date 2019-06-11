package VerifySequenceOfBST;
public class Solution {
    public boolean verifySequenceOfBST(int[] sequence)
    {
        if(sequence.length<1)
            return false;
        if(sequence.length==1)
            return true;
        return isPostOrder(sequence, 0, sequence.length-1);
    }
    private boolean isPostOrder(int[] sequence, int left, int last)
    {
        if(last-left+1<=2)
            return true;
        if(!isPartialPostOrder(sequence, left, last))
            return false;//
        int the_first_smaller_element= findTheFirstSmallerElement(sequence, left, last);
        if(the_first_smaller_element<0)
        {
            if(!isPostOrder(sequence, left, last-1))
                return false;
        }
        else
        {
            if(!isPostOrder(sequence, left, the_first_smaller_element))
                return false;
            if(!isPostOrder(sequence, the_first_smaller_element+1,last-1))
                return false;
        }
        return true;
    }
    private int findTheFirstSmallerElement(int[] sequence, int first, int last)
    {
        int the_last_element= sequence[last];
        if(last-first+1<=1)//只有根结点，没有左子树
            return -1;
        int index= last-1;
        while(sequence[index]>the_last_element&&index>first)
            index--;
        if(sequence[index]>the_last_element)//该数组中没有左子树
            return -1;
        else
            return index;
    }
    private boolean isPartialPostOrder(int[] sequence, int first, int last)
    {
        int index_of_the_first_smaller_element= findTheFirstSmallerElement(sequence, first, last);
        if(index_of_the_first_smaller_element<0)
            return true;
        for(int i=index_of_the_first_smaller_element;i>=first;i--)
        {
            if(sequence[i]>sequence[last])
                return false;
        }
        return true;
    }
    //-------------------UNIT TEST---------------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        int[]  sequence={0,1,4,3,2,6,7,9,8,5};
        //int[] sequence={4,3};
        //if(s.isPartialPostOrder(sequence, 0, sequence.length-1))
        if(s.isPartialPostOrder(sequence,0,sequence.length-1))
            System.out.println("True");
        else
            System.out.println("False");
        if(s.verifySequenceOfBST(sequence))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
