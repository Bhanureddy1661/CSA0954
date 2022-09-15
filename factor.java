import java.util.Scanner;
public class factors{

  public static void main(String[] args) {
    int c=0;
    Scanner sc= new Scanner(System.in);
    System.out.print("enetr the any number:");
    int number=sc.nextInt();


    System.out.print("Factors of " + number + " are: ");
if(number==0){
System.out.print("factorial=1");
}
else if(number<0){
System.out.print("invalid factor");
}
else{

    for (int i = 1; i <= number; ++i) {

      if (number % i == 0)
 {
               c++;
               System.out.println(i + " ");
              
      }
    }
}
System.out.print("Number of factors for"+number+":"+c);
  }
}
