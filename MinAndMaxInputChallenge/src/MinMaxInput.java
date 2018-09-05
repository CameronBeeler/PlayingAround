import java.util.Scanner;

public
class MinMaxInput
{
    private static Scanner scan = new Scanner(System.in);
    public static
    void main(String[] args)
    {
        boolean input;
        Integer temp=0, min=0, max=0, counter=0;
        String exit;

        while(true)
        {
            System.out.println("Please add a number");
            input = scan.hasNextInt();
            if(input)
            {
                temp=scan.nextInt();
                if(counter==0)
                {
                    max=temp;
                    min=temp;
                    counter++;
                    scan.nextLine();
                }
                else if(temp>max)
                {
                    max=temp;
                    counter++;
                    scan.nextLine();
                }
                else if (temp<min){
                    min=temp;
                    counter++;
                    scan.nextLine();
                }
                else
                {
                    counter++;
                    scan.nextLine();
                }
            }
            else
            {
                exit = scan.nextLine();
                if(exit.toString().equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println("Please try again, this time with an integer");
            }

        }

        System.out.println("Max = " + max + "\nMin = " + min + "\nCount of compared numbers = " + counter);
    }
}
