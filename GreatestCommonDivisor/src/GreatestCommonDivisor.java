public
class GreatestCommonDivisor
{
    public static
    void main(String[] args)
    {
        int a, b;

        a = 9;
        b = 99;
        System.out.println("a=" + a + ", b=" + b + ", return =" + getGreatestCommonDivisor(a, b));
        a = 99;
        b = 0;
        System.out.println("a=" + a + ", b=" + b + ", return =" + getGreatestCommonDivisor(a, b));
        a = 44;
        b = 200;
        System.out.println("a=" + a + ", b=" + b + ", return =" + getGreatestCommonDivisor(a, b));
        a = 1024;
        b = 256;
        System.out.println("a=" + a + ", b=" + b + ", return =" + getGreatestCommonDivisor(a, b));
        a = 300;
        b = 500;
        System.out.println("a=" + a + ", b=" + b + ", return =" + getGreatestCommonDivisor(a, b));
        a = 11;
        b = 13;
        System.out.println("a=" + a + ", b=" + b + ", return =" + getGreatestCommonDivisor(a, b));

    }

    public static
    int getGreatestCommonDivisor(int first, int second)
    {
        if ((first < 10) || (second < 10))
        {
            return -1;
        }

//        will increment through divisors, beginning with one, ending with 1/2 of the largest parameter
//        checking to see if the divisor is suitable for both parameters.

//        alternate method:  Create an array of all parameter divisors for both, and then compare them
        double largest, other;
        if (first > second)
        {
            largest = first;
            other = second;
        }
        else
        {
            largest = second;
            other = first;
        }

        int upperbounds               = ((int) (largest * .5));
        if(upperbounds>other) {upperbounds=(int)other;}
        int greatestCommonDenominator = 1;

        double test1=0, test2=0;

        for (int index = 2; index <= upperbounds; index++)
        {
            test1 = ((largest/index)*10)%10;
            test2 = ((other/index)*10)%10;

            if ((test1==0) && (test2==0))
            {
                greatestCommonDenominator = index;
            }
        }
        return greatestCommonDenominator;

    }
}
