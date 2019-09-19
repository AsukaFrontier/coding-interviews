package IsNumeric;
//
/**
 * 判断标准：
 * 'e', 'E'不能同时存在，且各自只能出现一次
 * '.'只能出现一次
 * 当前字符与下一个字符不能接连出现'+'或'-'
 * 'e', 'E', '+','-','.'不能位于最后一个位置
 * 不能存在非'0'-'9', eE+1.的字符
 */
public class Solution //
{
    //
    private char[] operators= {'+','-','e','E','.'}; //Solution类的字段
    private char[] numbers= {'0','1','2','3','4','5','6','7','8','9'};
    public boolean isNumeric(char[] str)
    {
        if(!baseCheck(str))
            return false;
        if(!eE(str))
            return false;
        if(!Dot(str))
            return false;
        if(!eELastPosition(str))
            return false;
        if(!minusPlusConsistent(str))
            return false;
        return true;
    }
    private boolean baseCheck(char[] str) //不能存在非'0'-'9', eE+1.的字符
    {
        for(int i=0;i<str.length;i++)
            if(str[i]!=operators[0]&&str[i]!=operators[1]&&str[i]!=operators[2]&&str[i]!=operators[3]&&str[i]!=operators[4]&&str[i]!=numbers[0]&&str[i]!=numbers[1]&&str[i]!=numbers[2]&&str[i]!=numbers[3]&&str[i]!=numbers[4]&&str[i]!=numbers[5]&&str[i]!=numbers[6]&&str[i]!=numbers[7]&&str[i]!=numbers[8]&&str[i]!=numbers[9])
                return false;
        return true;
    }
    private boolean minusPlusConsistent(char[] str) //当前字符与下一个字符不能接连出现'+'或'-'
    {
        for(int i=0;i<str.length;i++)
        {
            if(str[i]==operators[0]||str[i]==operators[1])
                if(i+1<str.length)
                    if(str[i+1]==operators[0]||str[i+1]==operators[1])
                        return false;
        }
        return true;
    }
    private boolean eELastPosition(char[] str) //'e', 'E', '+','-','.'不能位于最后一个位置
    {
        if(str[str.length-1]==operators[0]||str[str.length-1]==operators[1]||str[str.length-1]==operators[2]||str[str.length-1]==operators[3]||str[str.length-1]==operators[4])
            return false;
        return true;
    }
    private boolean eE(char[] str) //'e', 'E'不能同时存在，且各自只能出现一次
    {
        //
        int firstPosition= 0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]==operators[2]||str[i]==operators[3])
                firstPosition= i;
        }
        for(int i=firstPosition+1;i<str.length;i++)
            if(str[i]==operators[2]||str[i]==operators[3])
                return false;
        return true;
    }
    private boolean Dot(char[] str) //'.'只能出现一次
    {
        //
        int firstPotision= 0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]==operators[4])
                firstPotision= i;
        }
        for(int i= firstPotision+1;i<str.length;i++)
        {
            if(str[i]==operators[4])
                return false;
        }
        return true;
    }
    //------------UNIT TEST---------//
    public static void main(String[] args)
    {
        //
        char[] chars= {'+','1','0','0'};
        Solution s= new Solution();
        boolean isNumeric= s.isNumeric(chars);
        if(isNumeric)
            System.out.println("IsNumeric.");
        else
            System.out.println("IsNotNumeric.");
    }
}
