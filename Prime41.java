import java.util.*;
public class Prime41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:");
        int n= sc.nextInt();
        int i;
        boolean isPrime = true;
        if(n==2){
            System.out.println("Prime");
        } else{
            for(i = 2 ; i <= Math.sqrt(n) ; i++ ){ //Math.sqrt(n) is the square root of n used for optimization
            if(n%i== 0){  //n is the multiple of i (where i is the not equal to 1 or n)
               isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("not prime");
        }

        }
        
    }
    
}
