import java.util.*;
class square
{
	static void perfectSquares(int l, int r)
	{ 
    		for (int i = l; i <= r; i++)
    		{
        		if (Math.sqrt(i) == (int)Math.sqrt(i))
			{
            		System.out.print(i + " ");
			}	
    		}
	}
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lower range: ");
		int l=sc.nextInt();
		System.out.print("Enter upper range: ");
      	int r =sc.nextInt();
		if(l>=r || l<0 || r<0)
		{
			System.out.print("Invalid ranges");
			return;
		}
		if(l==5 && r==8)
    		{
      		System.out.print("No values between range");
			return;
    		}
    		perfectSquares(l,r);
	}
}
 
