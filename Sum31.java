import java.util.Scanner;
public class Sum31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int a = sc.nextInt();
        int sum = 0;//sum is insitialised by zero so that if we ittreate value will be updated in sum var
        int i = 1;
        while (i <= a ) {
            sum += i; //sum=sum+i;
            i++;
            System.out.print(" "+sum);//this will make code to give output of every ittration
        }
        System.out.println("\nSum:"+sum);
    }
}
