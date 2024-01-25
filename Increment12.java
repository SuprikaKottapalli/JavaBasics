public class Increment12 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;//It is post-increment operator where the value is used then changed 
        System.out.println(a);
        System.out.println(b);
        System.out.println("........................");
        int c = 5;
        int d = ++c;//It is pre-increment operator where the value is changed 1st and then used the value by adding 1
        System.out.println(c);
        System.out.println(d);
    }
}
