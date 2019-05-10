package ReplaceSpace;

public class Solution {
    public String replaceSpace(StringBuffer str)
    {
        //
        String s=str.toString();
        s=s.replaceAll(" ","%20");
        return s;
    }
    //---------------------------------------------/
    public static void main(String[] args)
    {
        //
    }
}
