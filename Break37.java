public class Break37 {
    public static void main(String[] args) {
        int i;
        for( i = 1 ; i <= 5 ; i++ ){
            if(i==3){
                break;
            }
          System.out.println(i);  
        }
        
        System.out.println("I m out of the loop");
    }
}
