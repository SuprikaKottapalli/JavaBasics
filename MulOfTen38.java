import java.util.*;
public class MulOfTen38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the num:");
            int i = sc.nextInt();
            if (i%10==0) {
                break;
            }
            System.out.println("The num u entered is:"+i);
        } while (true);
    }
}
