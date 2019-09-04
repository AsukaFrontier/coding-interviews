package Clone;
import java.util.HashMap;
//哈希表实现
public class Solution //
{
    //
    public RandomListNode clone(RandomListNode pHead)
    {
        HashMap<RandomListNode, RandomListNode> map= new HashMap<>();
        //原始链表的每个节点 作为 HashMap的Key
        //每个key对应着一个新生成的Value: RandomListNode结点
        RandomListNode cur= pHead;
        while(cur!=null)
        {
            map.put(cur, new RandomListNode(cur.lable));
            cur= cur.next;
        }
        //给HashMap的key所指向的value(RandomListNode结点)中的next赋值
        cur= pHead;
        while(cur!=null)
        {
            map.get(cur).next= map.get(cur.next);
            cur= cur.next;
        }
        //为HashMap的key所指向的value中的random项赋值
        cur= pHead;
        while(cur!=null)
        {
            map.get(cur).random= map.get(cur.random);
            cur= cur.next;
        }
        //不能直接将pHead返回给新链表的首结点
        RandomListNode copyedListHead= map.get(pHead);
        return copyedListHead;
    }
    private class RandomListNode
    {
        int lable;
        RandomListNode next;
        RandomListNode random;
        RandomListNode(int lable)
        {
            this.lable=lable;
        }
    }
}
