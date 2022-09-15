import java.io.*;
import java.util.Scanner;

class rev_word {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char ch;
            String nstr="";
      System.out.print("Enter any word:");
      String str=sc.nextLine();
		
	System.out.println("Original word: "+str);
	
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}
