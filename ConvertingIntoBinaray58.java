public class ConvertingIntoBinaray58 {
    public static int Binary(int BinaryNum){
        int MyNum = BinaryNum;
        int power = 0;
        int Decimal = 0;
        while (BinaryNum>0) {
            int LastDigit = BinaryNum % 10 ;
            Decimal = Decimal + (LastDigit* (int)Math.pow(2,power));
            power++;
            BinaryNum = BinaryNum/10;
        }
        System.out.println("Desimal of "+MyNum+" is: "+Decimal);
        return Decimal;

    }
    public static void main(String[] args) {
        Binary(1010100011);
    }
}
