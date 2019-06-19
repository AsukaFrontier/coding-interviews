package GetUglyNumber;

import java.util.ArrayList;

public class Solution {
    //
    public int getUglyNumber(int index)
    {
        ArrayList<Integer> aListOfUglyNumber= new ArrayList<>();
        for(int i=1;i<=6;i++)
            aListOfUglyNumber.add(i);//value: 1,2,3,4,5,6; index: 0,1,2,3,4,5;
        int sizeOfArray=aListOfUglyNumber.size()+1;//default, sizeOfArray==6;
        while(aListOfUglyNumber.size()<index)
        {
            for(int i=sizeOfArray;i<sizeOfArray*2;i++)
            {
                if(!isPrime(i))
                {
                    if(onlyHasPrimeFactors235(i))
                    {
                        aListOfUglyNumber.add(i);
                    }
                }
            }
            sizeOfArray*=2;
        }
        //
        return aListOfUglyNumber.get(index-1);
    }
    private boolean isPrime(int number)
    {
        //number>=2;
        for(int i=2; Math.pow(i,2)<=number; i++)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
    private boolean onlyHasPrimeFactors235(int number)
    {
        //number>=2;
        if(number%2==0)
        {
            if(number/2==1)
                return true;
            else
                return onlyHasPrimeFactors235(number/2);
        }
        else if(number%3==0)
        {
            if(number/3==1)
                return true;
            else
                return onlyHasPrimeFactors235(number/3);
        }
        else if(number%5==0)
        {
            if(number/5==1)
                return true;
            else
                return onlyHasPrimeFactors235(number/5);
        }
        else//不能被2,3,5整除
            return false;
    }
    //--------UNIT TEST-----//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        System.out.println(s.getUglyNumber(1500));
    }
}
