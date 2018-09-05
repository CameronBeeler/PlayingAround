public
class FlourPacker
{
    public static
    void main(String[] args)
    {
        int big, small, goal;
        big     =   1;
        small   =   0;
        goal    =   4;
        System.out.println("big = " + big + ", small = " + small + ", goal = " + goal + ", return=" + canPack(big, small, goal));

        big     =   1;
        small   =   0;
        goal    =   5;
        System.out.println("big = " + big + ", small = " + small + ", goal = " + goal + ", return=" + canPack(big, small, goal));
        big     =   0;
        small   =   5;
        goal    =   4;
        System.out.println("big = " + big + ", small = " + small + ", goal = " + goal + ", return=" + canPack(big, small, goal));
        big     =   2;
        small   =   2;
        goal    =   12;
        System.out.println("big = " + big + ", small = " + small + ", goal = " + goal + ", return=" + canPack(big, small, goal));
        big     =   -3;
        small   =   2;
        goal    =   12;
        System.out.println("big = " + big + ", small = " + small + ", goal = " + goal + ", return=" + canPack(big, small, goal));

    }


    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
//  bigcount = large flour bags of 5 kilo each
//  smallcount = small flour bags of 1 kilo each
//  goal = the goal amount of flour needed to assemble a package

//  bigCount + smallCount must be equal to or greater than goal
//  true if a combo of <some or all> of the given bigCount and given smallCount can equal exactly the goal.

        if((bigCount<0) || (smallCount<0) || (goal<0)) return false;

//  ALGORITHM - begin divising the max number of bigCount available into goal.
//  then add incrementally the smallCount into the remainder.  If we reach the mark, then return true

//  HOW MANY KILOS ACCOUNTED FOR BY LARGE BAGS?
        int kilosAccountedFor=0;
        int maxLargeBags = goal/5; // how many larges 5 kilo bags do I need?
        if (maxLargeBags<=bigCount)
        {// We got lucky...we can use a max of the large bags
            kilosAccountedFor=maxLargeBags*5;
        }
        else
        {
            maxLargeBags=bigCount;
            kilosAccountedFor=maxLargeBags*5;
        }

//  HOW MANY KILOS AVAILABLE AND ACCOUNTED FOR IN SMALL BAGS?
        int remainingKilos = goal - kilosAccountedFor;
        if(remainingKilos <= smallCount)
        {return true;}
        return false;

    }
}
