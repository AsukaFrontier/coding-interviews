package Permutation;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution //
{
    ArrayList<String> aListString= new ArrayList<>();
    public ArrayList<String> permutation(String str)
    {
        if(str==null&&str.length()==0)
            return aListString;
        char[] strsArray= strToArr(str);
        strArrayPermutation(strsArray, 0, strsArray.length-1);
        discardReplicateStrs();
        return sortStrArray();
    }
    private char[] strToArr(String str)
    {
        char[] strsArray= new char[str.length()];
        for(int i=0;i<str.length();i++)
            strsArray[i]= str.charAt(i);
        return strsArray;
    }
    private void strArrayPermutation(char[] chars, int startIndex, int endIndex) //endIndex包括数组尾部元素
    {
        //递归实现
        if(startIndex==endIndex)
        {
            //将当前数组值转换成String类型, 再添加入aListString;
            StringBuffer sb= new StringBuffer();
            for(char c: chars)
                sb.append(c);
            aListString.add(sb.toString());
        }
        else
            for(int i= startIndex;i<=endIndex;i++)
            {
                swapElement(chars, i, startIndex);
                strArrayPermutation(chars, startIndex+1, endIndex);
                swapElement(chars, i, startIndex);
            }
    }
    private void swapElement(char[] chars, int i, int j)
    {
        char temp= chars[i];
        chars[i]= chars[j];
        chars[j]= temp;
    }
    private void discardReplicateStrs()
    {
        //成员变量ArrayList<String> aListString
        for(int i=0; i<aListString.size();i++)
        {
            String str= aListString.get(i);
            for(int j=i+1;j<aListString.size();j++)
                if(str.equals(aListString.get(j)))
                    aListString.remove(j);
        }
    }
    private ArrayList<String> sortStrArray()
    {
        //ArrayList to Array
        String[] strsArr= new String[aListString.size()];
        for(int i=0;i<strsArr.length;i++)
        {
            strsArr[i]= aListString.get(i);
        }
        Arrays.sort(strsArr);
        ArrayList<String> arrayListString= new ArrayList<>();
        for(String s: strsArr)
            arrayListString.add(s);
        return arrayListString;
    }
    /**
    private String charArrToStr(char[] chars)
    {
        StringBuffer sBuffer= new StringBuffer();
        for(char c: chars)
            sBuffer.append(c);
        return sBuffer.toString();
    }
     */
    //-------------UNIT TEST-----//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        String str= "abc";
        ArrayList<String> aListString= s.permutation(str);
        for(String strs: aListString)
            System.out.println(strs);
    }
}
