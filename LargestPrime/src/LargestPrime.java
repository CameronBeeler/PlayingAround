public
class LargestPrime
{
    public static
    void main(String[] args)
    {
        int pc;
        pc  = 2;   System.out.println("The prime candidate is " + pc + ", and the max prime is: " + getLargestPrime(pc));
        pc  = 21;   System.out.println("The prime candidate is " + pc + ", and the max prime is: " + getLargestPrime(pc));
        pc  = 217;   System.out.println("The prime candidate is " + pc + ", and the max prime is: " + getLargestPrime(pc));
        pc  = 45;   System.out.println("The prime candidate is " + pc + ", and the max prime is: " + getLargestPrime(pc));
        pc  = -1;   System.out.println("The prime candidate is " + pc + ", and the max prime is: " + getLargestPrime(pc));

    }

    public static int getLargestPrime(int number)
    {
        if(number<2) {return -1;}

        int largestPrime=1;
        double remainder=0, tempNbr = number, tempIndex=0;

        for(int index=1; index<=number; index++)
        {
//  FIND the factor of the base number, then identify if the factor is a prime.  if it is, assign it to the largestPrime variable
            remainder   =  (((tempNbr/index)*10)%10);
            if(remainder==0) // then index is a factor of the number
            {// if the only factors of the index are one and the index, then index is a prime
                tempIndex=index;
                for (int primal = 2; primal <= index; primal++)
                {
                    remainder   =  (((tempIndex/primal)*10)%10);
                    if((remainder==0) && (primal==index))
                    {
                        largestPrime = index;
                    }else if((remainder==0) && (primal !=index)){break;}
                }
            }
        }
        if(largestPrime>1){return largestPrime;}
        return -1; // there were no prime factors...
    }
}
