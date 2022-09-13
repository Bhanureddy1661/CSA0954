import java.util.Scanner;
class Main
{
public static void main(String args[])
{
    int tax=0;
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary::");
        int a = sc.nextInt();
        if(a<150000 && a>0)
        {
            System.out.println("no tax");
        }
        else if(a>150000 &&a<=300000)
        {
            a=a-150000;
            tax=a*10/100;
            System.out.println("tax amount is" +tax);
        }
         else if(a>300000 &&a<=500000)
        {
            a=a-300000;
            tax=a*20/100;
            System.out.println("tax amount is" +tax);
        }
         else if(a>500000)
        {
            a=a-500000;
            tax=a*30/100;
            System.out.println("tax amount is" +tax);
        }
        else{
            System.out.println("enter valid amount");
        }
}
}
