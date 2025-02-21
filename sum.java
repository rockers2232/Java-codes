/*Write a program in java to implement to find the sum of n natural no. using command line arguments*/
public class sum
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int sum = (n * (n + 1)) / 2;
		System.out.println("The sum of first " + n + " natural numbers is: " + sum);
	}
}