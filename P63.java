public class P63 {
    public static void main(String[] args) {
        System.out.println(SumOfDigit(1234));
    }
    public static int SumOfDigit(int n){
        int VarSum = 0;
        while ( n > 0 ) {
            int lastDigit = n % 10;
            VarSum = VarSum + lastDigit;
            n = n / 10;
        }
        return VarSum;

    }
}
