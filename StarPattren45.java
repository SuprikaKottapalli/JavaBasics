public class StarPattren45 {
    public static void main(String[] args) {
        for(int line = 1; line <= 10; line++){
            //one line
            for(int time=1; time <= line; time++){
                System.out.print("*");
            }
            System.out.println();//this gives next line 
        }
    }
}
