package LastRemaining;
import java.util.LinkedList;
//链表实现
public class Solution
{
    //
    public int lastReamaining(int n, int m)
    {
        LinkedList<Integer> list= new LinkedList<>();
        for(int i=0;i<n;i++) //链表初始化
            list.add(i);
        int deleteElement= 0;
        while(list.size()>1)
        {
            deleteElement= (deleteElement+m-1)%list.size();
            list.remove(deleteElement);
        }
        return (list.size()==1)?(list.get(0)):(-1);
    }
}
