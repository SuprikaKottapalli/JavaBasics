public class Triangle0_1 {
    public static void main(String[] args) {
        Triangle(4);
    }
    public static void Triangle(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //inner loop
            for (int j = 1; j <= i ; j++) {
                //conditon for even and odd
              // int sum =  i + j ; 
               if((i+j) % 2 == 0 ){
                System.out.print("1");
               } else {
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }
    
}
