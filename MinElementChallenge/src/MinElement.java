import java.util.Scanner;

public
class MinElement
{
    private static Scanner scan = new Scanner(System.in);
    public static
    void main(String[] args)
    {
        int[] array = readIntegers();
        System.out.println("Number of Array elements: " + array.length);

    }
    private static
    int[] readIntegers()
    {
        int count;
        boolean test = false;

        System.out.println("Please enter # of array elements you want to enter" );
        test = scan.hasNextInt();
        if(test)
        {
            count= scan.nextInt();
            scan.nextLine();
        }
        else
        {
            return null;
        }

        int[] methodArray = new int[count];
        int inputInts = 1, min = 0, max = 0, eval=0;
        String temp;
        System.out.println(count + " numbers will be required...");
        while(inputInts <= count)
        {
            System.out.println("Please enter #" + inputInts + " value");
            test = scan.hasNextInt();
            if(test)
            {
                methodArray[(inputInts-1)] = scan.nextInt();
                eval = methodArray[inputInts-1];
                scan.nextLine();

                if(inputInts==1)
                {
                    min=max=eval;
                }
                else if(eval>max){ max = eval;}
                else if(eval<min){min = eval;}
                inputInts++;
            }
            else
            {
                temp=scan.nextLine();
                if(   (temp.equalsIgnoreCase("exit"))
                   || (temp.equalsIgnoreCase("quit"))
                   || (temp.equalsIgnoreCase("stop"))
                  )
                {
                    break;
                }
                else
                {
                    System.out.println("Please try again, this time with integer values");
                }
            }
        }

        for(int i=0;i < count;i++)
        {
            System.out.println("Array element #" + (i+1) + ", element value: " + methodArray[i]);
        }
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);

        return methodArray;
    }
}
