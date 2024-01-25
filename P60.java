import java.util.*;
public class P60 {
    public static void main(String[] args) {
        Average();
    }
    public static int Average(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd num: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd num: ");
        int num3 = sc.nextInt();
        int Avg = (num1+num2+num3)/3;
        System.out.println("The Avarage of "+num1+" + "+num2+" + "+num3+" is: "+Avg);

        return Avg;

    }


}
