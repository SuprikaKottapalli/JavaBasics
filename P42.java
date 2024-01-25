import java.util.*;
public class P42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int sum_even = 0;
        int sum_odd = 0;
        int n;
        int choice;
        do {
            System.out.print("Enter the integer:");
            n = sc.nextInt();
            if (n%2==0)
                {
                  sum_even += n;
                }
               else{
               sum_odd += n; 
              }
             System.out.print("Enter 1 to continue:");
             choice = sc.nextInt();}
         while (choice == 1) ;
             System.out.println("The sum of odd:"+sum_odd);
             System.out.println("The sum of even:"+sum_even);
            }}






         /*     int choice;
    int evenSum=0;
    int oddSum=0;
    do{
      System.out.print("Enter the number ");
      number= sc.nextInt();
      if(number%2==0) {
        evenSum+=number;}
        else{
          oddSum+=number;}
          System.out.print("Do you want to continue? Press1 for yes or 0 for no");
          choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
      }}*/

   
    
 