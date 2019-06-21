package ReverseSentence;

import java.util.Stack;

public class Solution
{
    //
    public String reverseSentence(String str)
    {
        //
        if(str.length()==0)//字符串为空
            return "";
        if(str.trim().length()==0)//字符串只有空格
            return str;
        //
        str=str.trim();//去除首尾空格
        String[] strs= str.split(" ");
        Stack<String> stack= new Stack<>();
        for(String s: strs)
            stack.push(s);
        StringBuilder reverse_str= new StringBuilder();
        for(int i=0;i<strs.length;i++)
        {
            reverse_str.append(stack.pop());
            reverse_str.append(" ");
        }

        return reverse_str.toString().trim();
    }
    //---------------------------------------------------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        String str= "student. a am I";
        System.out.println(s.reverseSentence(str));
    }
}
