public
class DiagonalStar
{
    public static
    void main(String[] args)
    {
        int x;
        x   =   2;  printSquareStar(x);
        x   =   5;  printSquareStar(x);
        x   =   6;  printSquareStar(x);
        x   =   8;  printSquareStar(x);
        x   =   10;  printSquareStar(x);
        x   =   12;  printSquareStar(x);


    }

    public static
    void printSquareStar(int number)
    {
        if (number < 5)
        {
            System.out.println("Invalid Value");
            return;
        }

        for(int outer=1;outer<=number;outer++) // taking one row at a time...
        {
            for(int inner=1;inner<=number;inner++) // columns in the row
            {
                if ((outer == 1) || (outer == number) || (inner==1) || (inner == number))
                {System.out.print("*");}
                else if(outer==inner)
                {System.out.print("*");}
                else if(outer == (number-inner+1))
                {System.out.print("*");}
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
