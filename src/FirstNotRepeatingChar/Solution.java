package FirstNotRepeatingChar;

public class Solution {
    //
    public int firstNotRepeatingChar(String str)
    {
        //
        boolean[] repeated= new boolean[str.length()];
        for(int i=0;i<str.length()-1;i++)
        {
            if(repeated[i])
                continue;
            else
            {
                String i_string= str.substring(i,i+1);
                for(int j=i+1;j<str.length();j++)
                {
                    if(i_string.equals(str.substring(j,j+1)))
                    {
                        repeated[i]=true;
                        repeated[j]=true;
                    }
                }
            }
        }
        //
        for(int i=0;i<repeated.length;i++) {
            if (!repeated[i])
                return i;
        }
        return -1;
    }
    //-------------------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        System.out.println(s.firstNotRepeatingChar("google"));
    }
}
