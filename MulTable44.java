import java.util.*;
public class MulTable44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:");
        int num = sc.nextInt();
        int i = 1;
        //int mul=1;
        for (i = 1; i <= 10; i++) {
            System.out.println(num+ "*"+ i +"="+ num * i);
             //  mul = num * i;
             // System.out.println(mul);
        }
    }
    
}
