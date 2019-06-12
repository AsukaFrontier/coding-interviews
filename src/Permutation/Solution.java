package Permutation;
import java.util.ArrayList;
public class Solution {
    //
    public ArrayList<String> Permutation(String str)
    {
        ArrayList<String> aList= new ArrayList<String>();
        return aList;
    }
    private StringBuilder stringToStringBuilder(String str)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++)
            sb.append(str.substring(i, i+1));
        return sb;
    }
}
