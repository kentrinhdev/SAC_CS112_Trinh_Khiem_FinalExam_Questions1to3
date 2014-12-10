// DoubleDice subclass of Dice superclass
public class DoubleDice extends Dice
{	
	public DoubleDice(int dNum) 
	{
		super();
		System.out.println("\nDoubleDice Dice No.1 = " + d1 +
							"\nDoubleDice Dice No.2 = " + d2);
		Throw = d1 + d2;
	} // end constructor TwoDice
	
	// Method to get and return choice
	public static String getChoice(int number) 
	{
		switch (number) 
		{
    		case 1:
    			choice = "LO";
    			break;
    		case 2:
    			choice = "LO";
    			break;
    		case 3:
    			choice = "LO";
    			break;
    		case 4:
    			choice = "LO";
    			break;
    		case 5:
    			choice = "LO";
    			break;
    		case 6:
    			choice = "LO";
    			break;
    		case 7:
    			choice = "HI";
    			break;
    		case 8:
    			choice = "HI";
    			break;
    		case 9:
    			choice = "HI";
    			break;
    		case 10:
    			choice = "HI";
    			break;
    		case 11:
    			choice = "HI";
    			break;
    		case 12:
    			choice = "HI";
    			break;
    		default:
    			choice = null;
		}
			return choice;
	} // end getChoice method
	
    public String getThrow( int numOfGet )
    {
		throwSum = Throw;
		System.out.println( "DoubleDice ALL Dice thrown = " + throwSum );
		
		if (throwSum <= 6)
		{
			throwSum = 1;
		}
			else if (throwSum >= 7)
			{
				throwSum = 12;
			}
				// Return the computer's choice.
				return getChoice (throwSum);
    } // end getThrow method
    
	// Method should generate a random number and
	// 	return the computers choice.
    public static String computerChoice() 
	{
		if (Throw <= 6)
		{
			Throw = 1;
		}
			else if (Throw >= 7)
			{
				Throw = 12;
			}
				// Return the computer's choice.
				return getChoice(Throw);
	} // end computerChoice method
    
    // ToString method that returns the number of dices and last value thrown
    public String toString(int rNum) 
    {
        countNumberOfDices = rNum;
    	System.out.println("\nDoubleDice ToString Method:\nThe number of dices = " + countNumberOfDices);
    	lastValueThrown = Integer.toString(Throw);
        System.out.println("The last value thrown = " + lastValueThrown);
        return lastValueThrown; 
	} // end toString method

} // end class TwoDice