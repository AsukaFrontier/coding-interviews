package Clone;

public class Solution {
    public RandomListNode clone(RandomListNode pHead)
    {
        return pHead;
    }
    private class RandomListNode
    {
        int lable;
        RandomListNode next;
        RandomListNode random;
        RandomListNode(int label)
        {
            this.lable=label;
        }
    }
}
