import java.util.*;
public class nthodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        int i;
	for(i=1;i<=2*n;i++)
	{
		if(i%2 == 0)
			continue;
	}  
System.out.println("nth odd numder is" +i);
    }
}
