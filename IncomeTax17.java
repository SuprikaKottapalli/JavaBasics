import java.util.*;
public class IncomeTax17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        double tax;
        if(Income < 100000)
        {
            tax = 0;
            System.out.println("You have zero tax to pay");
        }
        else if ( Income == 100000 && Income > 1000000  )
        {
            tax = Income+(Income * (0.2));
            System.out.println("You will be having 20% tax on ur salary i.e: " +tax);
        }
        else 
        {
            tax = Income+(Income * (0.3));
            System.out.println("You will be having 30% tax on ur salary i.e: " +tax);
        }
    }
    
}
