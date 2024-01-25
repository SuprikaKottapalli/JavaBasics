import java.util.*;
public class DecimalToBinary59 {
    public static void DecimalToBinary(int n){
        int pow = 0;
        int BinaryNum = 0;

        while (n>0) {
            int rem = n%2;
            BinaryNum = BinaryNum +rem * (int)Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        System.out.println("The Binary Num is: "+BinaryNum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num u want to covert into Binary form: ");
        int a = sc.nextInt();
        DecimalToBinary(a);
        
    }
    
}
