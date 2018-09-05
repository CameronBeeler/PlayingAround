import java.util.Scanner;

public
class ReadingUserInput
{
    public static Scanner scan = new Scanner(System.in);

    public static
    void main(String[] args)
    {
        System.out.println("The sum of the 10 digits is " + scanAndSum());
    }

    public static int scanAndSum()
    {
        System.out.println("Please enter 10 numbers for me to sum");

        int     temp        =   0;
        int     sum         =   0;
        boolean input       =   false;

        for(int index=1;index <=10; index++)
        {
            System.out.println("Please enter #" + (index) ) ;
            while(!input)
            {
                input = scan.hasNextInt();
                if(input)
                {
                    temp = scan.nextInt();

                    sum += temp;
                }
                else
                {
                    System.out.println("You need to input a number please.");
                }
                scan.nextLine();

            }
            input = false; // setting the stage for the next while loop
        }
        return sum;
    }
}
