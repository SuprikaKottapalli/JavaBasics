public class FloydsTriangle67 {
    public static void main(String[] args) {
        FloydsTriangle(5);
    }

    public static void FloydsTriangle(int n){
        // outer loop
        int counter = 1;
        for (int i = 1; i <= n ; i++ ) {
            //inner loop tells how many time counter will be printed
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter+" ");
               counter++;
                
            }
            System.out.println();
        }
    }
}
