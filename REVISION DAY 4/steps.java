import java.util.*;
public class steps
{
	public static void main(String[] args)
	{
		try
		{
			int c=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number: ");
			int n=sc.nextInt();
			System.out.println("Explanation: ");
			while(n!=0)
			{	
				c++;
				if(n%2==0)
				{
					System.out.printf("\nStep %d:- %d is even; divide by 2 and obtain ",c,n);
					n=n/2;
					System.out.print(n);
				}
				else
				{
					System.out.printf("\nStep %d:- %d is odd; subtract 1 and obtain ",c,n);
					n=n-1;
					System.out.print(n);
				}
			}
			System.out.println("\nTotal No. of steps= "+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid");
		}
	}
}
