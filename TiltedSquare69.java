public class TiltedSquare69 {
    public static void main(String[] args) {
       Square(5);
       // printParallelogram(5);
    }
    public static void printParallelogram(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void Square(int n){
        //Outer loop 
        for(int i = 1 ; i <= n ; i++ ){
            //Spaces
            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(" ");
            }
            //Stares
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
