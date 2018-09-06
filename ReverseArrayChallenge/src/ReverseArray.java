import java.util.ArrayList;
import java.util.List;

public
class ReverseArray
{
    public static
    void main(String[] args)
    {
        ArrayList<String> stringArray = new ArrayList<String>();

        stringArray.add("Hello");
        stringArray.add("Darkness");
        stringArray.add("My");
        stringArray.add("Old");
        stringArray.add("Friend");
        stringArray.add("I've");
        stringArray.add("Come");
        stringArray.add("To");
        stringArray.add("Talk");
        stringArray.add("With");
        stringArray.add("You");
        stringArray.add("Again");

        printArray(stringArray);
        reverse(stringArray);
        printArray(stringArray);
    }

    public static void reverse(List<String> array)
    {
        ArrayList<String> reverse = new ArrayList<String>();

        int asize = array.size();
        int forSizeArray = asize;
        for(int i=0;i<forSizeArray;i++)
        {
            reverse.add(array.get(--asize));
        }
//        printArray(reverse);
        array.clear();
        array.addAll(reverse);
    }

    public static void printArray(List<String> stringArray)
    {

        for(int i=0;i<stringArray.size();i++)
        {
            System.out.println(stringArray.get(i));
        }
    }
}
