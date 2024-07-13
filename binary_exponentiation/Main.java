public class Main
{
  static double power (double a, double b)
  {
	if (b == 0)
	  {
		return 1;
	  }
	double subResult = power (a, (long) b / 2);
	if (b < 0)
	  {
		if ((long) b % 2 == -1)
		  {
			return subResult * subResult / a;
			
		  }
		else
		  {
			return subResult * subResult;
		  }
	  }
	else
	  {
		if (b % 2 == 1)
		  {
			return subResult * subResult * a;
		  }
		else
		  {
			return subResult * subResult;
		  }
	  }




  }
  public static void main (String[]args)
  {
	System.out.println (power (2, -13));
  }
}
