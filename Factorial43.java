import java.util.*;
public class Factorial43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:");
        int num = sc.nextInt();
        int fact = 1 ;
        for(int i = 1; i<=num;i++){
            fact *= i;//factioral formula, fact = fact*i
        }
        System.out.println("Factorial is :"+fact);

    }
}
