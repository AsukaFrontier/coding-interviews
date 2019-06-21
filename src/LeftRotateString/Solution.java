package LeftRotateString;

public class Solution
{
    //
    public String leftRotateString(String str, int n)
    {
        if(str.length()==0)
            return "";
        int num_of_suplementary_string=n/str.length()+1;
        String str_concat= str;
        for(int i=0;i<num_of_suplementary_string;i++)
        {
            str_concat=str_concat+str;
        }
        return str_concat.substring(n, n+str.length());
    }
}
