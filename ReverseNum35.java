public class ReverseNum35 {
    public static void main(String[] args) {
        int n = 1234;
        int a=0;
        while ( n > 0 ) {
            int lastDigit = n % 10;
            a = ( a * 10 ) + lastDigit;
            n = n / 10;
        }
        System.out.println(a);
    }
}
