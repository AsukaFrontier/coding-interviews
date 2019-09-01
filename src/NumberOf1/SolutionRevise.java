package NumberOf1;
public class SolutionRevise {
    public int numberOf1(int n)
    {
        int count= 0;
        while(n!=0)
        {
            count++;
            n=(n-1)&n;
        }
        return count;
    }
    //--------UNIT TEST-----//
    public static void main(String...args)
    {
        SolutionRevise sR= new SolutionRevise();
        int inputTest= -12;
        int output= sR.numberOf1(inputTest);
        System.out.println(output);
    }
}
