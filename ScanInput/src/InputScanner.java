import java.util.Scanner;

public
class InputScanner
{
    public static
    void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("type your Year of birth here:");
        boolean input = false;
        while(!input)
        {
            input = scan.hasNextInt();
            if (input)
            {
                int yearOfBirth = scan.nextInt();
                System.out.println("You typed: " + yearOfBirth);
                scan.nextLine();

            }
            else
            {
                System.out.println("you entered poorly, try again");
            }

        }

        System.out.print("type your name here:");
        String sinput = scan.nextLine();
        System.out.println("You typed: " + sinput);
        scan.close();
    }
}
