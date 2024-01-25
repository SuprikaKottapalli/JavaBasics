public class Functions49 {
    public static void PrintHelloWorld(){ //function and void will have no return 
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
        return;//we can write or we cannot because its void 
    }
    public static void main(String[] args) {
        PrintHelloWorld();// funtion call
    }
}

/* we can call functions or methods
 * public static = assces spesifiers
 * void is the return type "void will have no return"
 * if we put "int" or any other return type in place of void we need to mention retrun type 
 * for example :
 *  public static int functionName(){
 *      System.out.println("Hello world");
 *      return 1; //here we can put int in place of 1
 * }
 * to call this function we use function name here it is "functionName()"
 */
