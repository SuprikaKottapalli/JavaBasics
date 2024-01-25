public class FunctionOverloding54 {
    //Sum Function
    public static int Sum(int a , int b ){
        return a+b;
    }
    // 2nd Sum Function
    public static int Sum(int a , int b , int c ){
        return a + b + c;
    }
     
    //main function
    public static void main(String[] args) {
        System.out.println(Sum(4, 5));
        System.out.println(Sum(5 , 6, 7));
    }

}
