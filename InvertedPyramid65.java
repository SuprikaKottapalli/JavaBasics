public class InvertedPyramid65 {
    public static void main(String[] args) {
        Pyramid(10);
    }
    public static void Pyramid(int n){
        for (int i = 1; i <=n; i++) {
            //empty spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
