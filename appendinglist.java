import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    List<Integer> posi = new ArrayList<>();
	    Scanner input= new Scanner(System.in);
	     System.out.println("Enter the numeber of elements:");
	    int x = input.nextInt();
	    int array[] = new int[x];
	    for (int i =0;i<x;i++)
	    {
	        array[i] =input.nextInt();
	    }
	    for (int i =0;i<x;i++)
	    {
	        System.out.println(array[i]);
	    }
	    for(int j=0;j<x;j++)
	    {
	        if(array[j]>0)
	        {
	            posi.addAll(Arrays.asList(array[j]));
	        }
	    }
	    System.out.println(posi);
	}
}
