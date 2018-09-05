public
class FactorPrinter
{
    public static
    void main(String[] args)
    {
        int number;
        number=0;       printFactors(number);
        number=1;       printFactors(number);
        number=5;       printFactors(number);
        number=17;      printFactors(number);
        number=99;      printFactors(number);
        number=100;     printFactors(number);
        number=17284;   printFactors(number);

    }
    public static void printFactors(int number)
    {
        if (number < 1)
        {System.out.println("Invalid Value");}
        double temp=0.0, nbr=number;
        for(int index=1; index<=number ;index++)
        {
            temp=(((nbr/index)*10)%10);
            if (temp == 0)
            {
                if(index==1)
                {System.out.print(index);}
                else
                {System.out.print(" " + index);}
            }
        }

    }
}
