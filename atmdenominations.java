import java.util.*;
public class denomination
{
	public static void main(String[] args) 
	{
	      Scanner sc=new Scanner(System.in);
       	int x,y,m,n,z,a,a1,b,b1,c,c1,d,d1;
        	System.out.print("Enter the 1st Denomination : ");
        	a=sc.nextInt();
	  	if(a<0)
		{
			System.out.print("Invalid");
			return;
		}
		if(a==500 || a==100 || a==2000 || a==200)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("Invalid");
			return;
		}
        	System.out.print("Enter the 1st Denomination number of notes : ");
        	a1=sc.nextInt();
        	x=a*a1;
        	System.out.print("Enter the 2nd Denomination : ");
        	b=sc.nextInt();
		if(b<0)
		{
			System.out.print("Invalid");
			return;
		}
		if(b==500 || b==100 || b==2000 || b==200)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("Invalid");
			return;
		}
        	System.out.print("Enter the 2nd Denomination number of notes : ");
        	b1=sc.nextInt();
        	y=b*b1;
       	System.out.print("Enter the 3rd Denomination : ");
        	c=sc.nextInt();
		if(c<0)
		{
			System.out.print("Invalid");
			return;
		}
		if(c==500 || c==100 || c==2000 || c==200)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("Invalid");
			return;
		}
        	System.out.print("Enter the 3rd Denomination number of notes : ");
        	c1=sc.nextInt();
        	m=c*c1;
        	System.out.print("Enter the 4th Denomination : ");
        	d=sc.nextInt();
		if(d<0)
		{
			System.out.print("Invalid");
			return;
		}
		if(d==500 || d==100 || d==2000 || d==200)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("Invalid");
			return;
		}
        	System.out.print("Enter the 4th Denomination number of notes : ");
        	d1=sc.nextInt();
        	n=d*d1;
        	z=x+y+m+n;
        	System.out.print("Total Available Balance in ATM = "+z);
	}
}
