public class PrintReverseNum34 {
    public static void main(String[] args) {
        int i = 31082002 ;
        int lastDigit;
        //int n;
        while (i>0) {   // '>0' means till the last digit in our metioned num loop runs (it takes num place value )
            lastDigit = i % 10 ;  //  '%(Reminder)' helps to get the last digit of any num
            System.out.print(lastDigit+" ");  //we print the last digit here
            i /= 10; // i=  i / 10 ; both are same
            // '/10' this make to eleminate the last digit we found and make curser move to 2nd last digit and so on 
            //when i=i/10 becomes "0" the loop stops
        }
    }
}
