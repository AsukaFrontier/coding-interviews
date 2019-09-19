package InsertAndFirstAppearingOnce;
import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.Scanner;
//
public class Solution //
{
    //
    char emptySign= '#';
    LinkedList<Character> charList= new LinkedList<>();
    //ArrayList<Character> aCharList= new ArrayList<>();
    public void insert(char ch)
    {
        //
        if(charList.size()==0)
            charList.add(ch);
        else
        {
            for(int i=0;i<charList.size();i++)
                if(ch==charList.get(i))
                {
                    charList.remove(i);
                    break;
                }
                else
                {
                    charList.addLast(ch);
                    break;
                }
        }
    }
    public char firstAppearingOnce()
    {
        if(charList.size()==0)
            return emptySign;
        else
            return charList.peekFirst();
    }
    //---------UNIT TEST----------//
    public static void main(String[] args)
    {
        //
        Scanner in= new Scanner(System.in);
        Solution s= new Solution();
        //char[] chars= {'B','a','b','y','B','a','b','y'};
        char[] chars= {'g','o','o','g','l','e'};
        for(int i=0;i<chars.length;i++)
        {
            s.insert(chars[i]);
            System.out.print(s.firstAppearingOnce());
        }
    }
}
