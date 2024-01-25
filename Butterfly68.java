public class Butterfly68 {
    public static void main(String[] args) {
        Butterfly(5);
    }


    
    public static void Butterfly(int n){
        //1st half
        for (int i = 1; i <=n; i++) {
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }

        

        //2nd half

         for (int i = n; i >=1; i--) {
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
