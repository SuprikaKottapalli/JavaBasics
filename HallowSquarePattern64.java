public class HallowSquarePattern64 {
    public static void main(String[] args) {
        HallowSquare(10, 10);
    }
    public static void HallowSquare(int row , int coloum){
        //outer loop
        for (int i = 1; i <= row ; i++) {
            //inner - coloum
            for (int j = 1; j <=coloum; j++) {
                //cell-(i,j)
                if ( i == 1 || i == row || j == 1 || j == coloum ) {
                    //boundray check
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
