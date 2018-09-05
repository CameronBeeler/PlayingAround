public
class LastDigitChecker
{
    public static
    void main(String[] args)
    {
        int a, b, c;
        a=9;    b=19;   c=28;   System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=10;   b=19;   c=972;  System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=11;   b=31;   c=1001; System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=444;  b=1001; c=732;  System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=5000; b=472;  c=22;   System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=271;  b=472;  c=912;   System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=39;   b=19;   c=1;   System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));
        a=99;   b=-19;  c=999;   System.out.println("values a=" + a + ", b=" + b + ", c=" + c + " :: return= " +  hasSameLastDigit(a, b, c));

    }
    public static boolean hasSameLastDigit(int one, int two, int three)
    {

        if((one<10)     || (one>1000)   ||
           (two<10)     || (two>1000)   ||
           (three<10)   || (three>1000))
        {return false;}

        int last_one    =   one%10;
        int last_two    =   two%10;
        int last_three  =   three%10;

        if((last_one    ==  last_two)   ||
           (last_one    ==  last_three) ||
           (last_two    ==  last_three))
        {return true;}
        else
        {return false;}

    }
}
