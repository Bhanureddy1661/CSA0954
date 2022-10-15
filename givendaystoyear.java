import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int d,years,weeks,days,yr;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of days: ");
		if(!sc.hasNextInt())
		{
		    System.out.println("Enter only integerts");
		    return;
		}
		d=sc.nextInt();
		if(d<0)
		{
		    System.out.println("Enter only positive integers");
		    return;
		}
		years=d/365;
		yr=d%365;
		weeks=yr/7;
		days=yr%7;
		System.out.println("Years: "+years);
		System.out.println("Weeks: "+weeks);
		System.out.println("Days: "+days);
	}
}
