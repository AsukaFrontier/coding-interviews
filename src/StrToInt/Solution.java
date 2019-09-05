package StrToInt;
public class Solution //不能使用字符串库函数的转换整数
{
    //
    public int strToInt(String str) //MAIN
    {
        //return Integer.valueOf(str);
        if(!isLegalInt(str)) //判断一个给定的字符串是否是合法的表达；
            return 0;
        else
            return strPrintToInt(strToAsciiSequence(str));
    }
    private int strPrintToInt(int[] ints)//假定String已合法, 判定字符串首元素是"+", "-", "0-9"
    {
        if(ints[0]==43)//"+"
            return strPrintToInt(ints, 1);
        else if(ints[0]==45) //"-"
            return - strPrintToInt(ints, 1);
        else
            return strPrintToInt(ints, 0);
    }
    private int strPrintToInt(int[] ints, int begin_index)// strPrintToInt(int[] ints)的辅助方法
    {
        int sum=0;
        for(int i=begin_index;i<ints.length;i++)
        {
            int int_cur= ints[i]-0x30;
            sum= int_cur*(int)(Math.pow(10,ints.length-1-i))+sum;
        }
        return sum;
    }
    private boolean isLegalInt(String str)//判断一个给定的字符串是否是合法的表达；
    {
        int str_length= str.length();
        //字符串子串首位，应为"+" or "-" or "0~9"的字符串;
        //子串非首位元素都应为"0~9"的子串;
        if(str.length()==0)//若字符串长度为0，则判断非法表达，应返回0;
            return false;
        //ASCII
        int[] ints= strToAsciiSequence(str);
        if(ints.length==1)//字符串长度为1
            if(ints[0]>=30&&ints[0]<=39)
                return true;
        if(!(ints[0]==43||ints[0]==45||(ints[0]>=48&&ints[0]<=57)))//字符串长度大于1
            return false;
        else
            for(int i=1;i<str.length();i++)
                if(!(ints[i]>=48&&ints[i]<=57))
                    return false;
        return true;
    }
    private int[] strToAsciiSequence(String str)//将字符串转换成ascii码的数组
    {
        StringBuffer sb= new StringBuffer();
        char[] chars= str.toCharArray();
        int[] ints= new int[chars.length];
        for(int i=0;i<chars.length;i++)
            ints[i]=(int) chars[i];
        return ints;
    }
    /**
    private String strToAscii(String str)//String: String to ASCII
    {
        StringBuffer s_buffer= new StringBuffer();
        char[] chars= str.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(i!=chars.length-1)
                s_buffer.append((int) chars[i]).append(" ");
            else //添加最后一个元素，不需要再添加split字符;
                s_buffer.append((int) chars[i]);
        }
        return s_buffer.toString();
    }
    private String asciiToString(String str)//String: ASCII to String
    {
        //
        StringBuffer s_buffer= new StringBuffer();
        String[] chars= str.trim().split(" ");
        for(int i=0;i<chars.length;i++)
            s_buffer.append((char) Integer.parseInt(chars[i]));
        return s_buffer.toString();
    }
     */
    //---------------------------------------------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        String str="-123";
        /**
        if(s.isLegalInt(str))
            System.out.println("Is legal int.");
        else
            System.out.println("Not legal int.");
        */
        System.out.println(s.strToInt(str));
    }
}
