package NumberOf1Between1AndN;
public class Solution
{
    //
    //public String numberOf1Between1AndN(int n)
    public int numberOf1Between1AndN(int n)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<=n;i++)
            sb.append(i);
        String str= sb.toString();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.substring(i,i+1).equals("1"))
                count++;
        }
        return count;
        //return str;
    }
    //----UNIT TEST----//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        System.out.println(s.numberOf1Between1AndN(13));
    }
}
