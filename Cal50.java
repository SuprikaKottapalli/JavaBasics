import java.util.*;
public class Cal50 {
//     //funtion defination
    public static int Add(int num1 , int num2){//formal parameters , they are declared in function defination
        int sum = num1 + num2;
        //System.out.println(sum); //we can write here also 
       return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int sum = Add(a, b);//actual parameters or arguments they are declared in call function
        System.out.println("The sum is:"+sum);// we can write print statment here and inside the fun also, to write here we need to declare 'sum' variable as we did in before line
    }
}
