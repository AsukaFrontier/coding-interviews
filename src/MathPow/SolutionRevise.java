package MathPow;
public class SolutionRevise //
{
    public double power(double base, int exponent)
    {
        if(exponent==0)
            return 1.0;
        else
            if(exponent>0)
                return positivePower(base, exponent);
            else
                return negativePower(base, exponent);
    }
    private double positivePower(double base, int exponent)
    {
        if(base==0)
            return 0;
        double baseExponent= 1.0;
        while(exponent>0)
        {
            baseExponent=base*baseExponent;
            exponent--;
        }
        return baseExponent;
    }
    private double negativePower(double base, int exponent)
    {
        if(base==0)
        {
            System.out.println("Error.");
            return 0;
        }
        else
            return 1/positivePower(base, -exponent);
    }
}
