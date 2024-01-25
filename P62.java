import java.util.*;
public class P62 {
    public static void main(String[] args) {
        Palindrome();
    }
    public static void Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int NumToCheck = sc.nextInt();
        int OriginalNum = NumToCheck;
        int rev = 0;
        while (NumToCheck>0) {
            int lastDigit = NumToCheck%10;
            rev = (rev * 10)+lastDigit;
            NumToCheck /= 10;
        } 
        int final_num = rev;
        if (OriginalNum==final_num) {
            System.out.println(OriginalNum+" Is a Palindrome Num");
        } else {
            System.out.println(OriginalNum+" Is not a Palindrome Num");
        } 
        //return final_num;
        
             

    }
    
}
