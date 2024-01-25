import java.util.*;
public class LeapYear26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) 
        {
            if (year % 100 == 0 )
            {
              if ( year % 400 == 0 )
              {
              System.out.println("It is a leap year");
              }
              else
              System.out.println("Its not a Leap year");
            }
            else
            System.out.println("Its a leap year");
        } 
        else {
            System.out.println("Its not a leap year");
        }
    }
}
