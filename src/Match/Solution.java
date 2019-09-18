package Match;
//
public class Solution //
{
    //
    public boolean match(char[] str, char[] pattern) //给定的字符型数组str[]能够匹配pattern
    {
        if(!strPartiallyMatchPattern(str, pattern)) //若基础判断都不过关, 则肯定不匹配;
            return false;
        return strMatchPattern(str, 0, pattern, 0);
    }
    private static boolean strMatchPattern(char[] str,int indexOfStr,  char[] pattern, int indexOfPattern) //也将a*b*c*等情况考虑
    {
        //
        return false;
    }
    private static boolean strPartiallyMatchPattern(char[] str, char[] pattern) //只能判断字符与"."
    {
        //
        if(str.length!=pattern.length)
            return false;
        for(int i=0;i<str.length;i++)
        {
            char curChar= str[i];
            char curPatt= pattern[i];
            if(curChar==curPatt||curPatt==46) //ASCII '.': 46;
                continue;
            else //curChar!=curPatt&&curPatt!=46
                return false;
        }
        return true;
    }
    //--------------UNIT TEST---------//
    public static void main(String[] args)
    {
        //
        char[] strEasy= {'a','a','a'};
        char[] patternEasy= {'a','.','a'};
        Solution s= new Solution();
        boolean matchEasy = s.match(strEasy, patternEasy);
        if(matchEasy)
            System.out.println("Match.");
        else
            System.out.println("Not Match.");
    }
}
