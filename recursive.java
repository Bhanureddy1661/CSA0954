import java.util.*;
class factorecu
{  
	static int factorial(int n)
	{    
  		if(n==0)
		{
			return 1;
		}        
  		else
		{
			return(n*factorial(n-1));
		}        
 	}    
	public static void main(String args[])
	{  
		int i,fact=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		if(!sc.hasNextInt())
		{
			System.out.println("Invalid N");
		      return;
		}
		num=sc.nextInt();      
		if(num<0)
		{
		    System.out.println("Invalid N");
		    return;
		}
  		fact = factorial(num);   
  		System.out.println("Factorial of "+num+" is: "+fact);    
 	}  
}  
