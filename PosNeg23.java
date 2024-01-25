import java.util.*;
public class PosNeg23 {
    public static void main(String[] args) {
        System.out.println("Welcome to positive & Negative Finder");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int a = sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive Num");
        }
        else if (a<0)
        {
        System.out.println("Negetive Num");
        }
        else
        System.out.println("It's Zero");
    }
    
}