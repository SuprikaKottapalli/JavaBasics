public class BinomialCoeff53 {
    //Factorial Function{
    public static int Factorial(int n){
        int f = 1;
        for(int i = 1 ; i<=n; i++ ){
            f *= i;
        }
        return f;//f is the factorial value
    }

    //Binomial Coeffecient Function
    public static int BinoCoeff(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);
        int BinoCoeff = fact_n / (fact_r * fact_nmr);
        return BinoCoeff;
    }

    //Main Function
    public static void main(String[] args) {
        System.out.println("The Binomial Coeffecient of 5 and 2 is:" + BinoCoeff(5, 2));
    }
}
