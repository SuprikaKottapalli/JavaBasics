import java.util.*;
public class ConMulOfTen40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your num:");
            int i = sc.nextInt();
            if (i%10==0) {
                System.out.println("I cant print that!!"); 
                continue;   
                
            }
            System.out.println(i);
        } while (true);
    }
}
