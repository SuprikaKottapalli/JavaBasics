public class FunctionOverloding55 {
    //1st function
    public static float Function1(float a , float b){
        return a+b;
    }
    //2nd function
    public static int Function1(int a,int b){
        return a+b;
    }
    //main
    public static void main(String[] args) {
        System.out.println(Function1(1.09f, 8.9f));
    }
}

