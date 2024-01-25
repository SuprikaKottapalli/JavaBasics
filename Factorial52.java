import java.util.*;
public class Factorial52 {
    public static int Factorial(int n){
        int f = 1;
        for(int i = 1 ; i<=n; i++ ){
            f *= i;
        }
        return f;//f is the factorial value
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to find Factorial of:");
        int n = sc.nextInt();
        int f = Factorial(n);
        System.out.println("The Factorial of your num is :"+ f);
    }
}
