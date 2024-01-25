public class Dimond71 {
    public static void Dimond(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Stares
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //inner loop 
        for (int i = n; i >=1 ; i--) {
            //spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Stares
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Dimond(10);
    }
}
