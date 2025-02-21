/*Write a program in java to find factorial of no. using commmand line arguments*/
public class factorial
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The Factorial of " + n + " is: " + f);
	}
}