import java.util.*;
class lcmgcd
{
  	static int gcd(int a, int b)  
  	{  
    		return b == 0? a:gcd(b, a % b);
	}
  	static int LcmOfArray(int[] arr, int idx)
  	{
    		if (idx == arr.length - 1)
		{
			return arr[idx];
    		}
    		int a = arr[idx];
   		int b = LcmOfArray(arr, idx+1);
    		return (a*b/gcd(a,b)); 
  	}
	static int _gcd(int a, int b)  
  	{  	
		if(a==0)
		{
			return b;
		}
    		return _gcd(b%a,a);
	}
	static int figcd(int arr[],int n)
	{
		int result=arr[0];
		for(int i=0;i<n;i++)
		{
			result=gcd(arr[i],result);
		}
		return result;
	}
  	public static void main(String[] args)
  	{
 		int n,i,j,k,_gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");	
		n=sc.nextInt();
		if(n<=0)
		{
			System.out.print("Invalid");
			return;
		}
    		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Number "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		System.out.print("LCM= "+LcmOfArray(arr, 0)+ "\n");
		System.out.println("GCD= "+figcd(arr,n));
  }
}
