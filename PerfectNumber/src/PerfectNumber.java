import java.util.ArrayList;
import java.util.List;

public
class PerfectNumber
{
    public static
    void main(String[] args)
    {
        int x=0;
        x   =   5;  findPerfectNumbers(x);
        x   =   6;  findPerfectNumbers(x);
        x   =   28;  findPerfectNumbers(x);
        x   =   500;  findPerfectNumbers(x);
        x   =   10000;  findPerfectNumbers(x);


    }

    public static boolean isPerfectNumber(int number)
    {
        if (number < 1)
        {
            return false;
        }
        List<Integer> divisorList = new ArrayList<>();

        double nbr = number, temp=0;
        int    sum = 0;


        for (int index = 1; index < number; index++)
        {
            temp = (((nbr/index)*10)%10);
            if(temp==0)
            {
                sum += index;
            }
        }
        if(sum==nbr){return true;}
        return false;
    }

    public static void findPerfectNumbers(int max)
    {
        if (max < 6)
        {
            System.out.println("The first perfect number begins at 6, please enter a number larger than 6");
        }

        for(int x=1; x<max; x++)
        {
            if (isPerfectNumber(x))
            {
                System.out.println(x + " is a perfect number");
            }
        }
    }
}
