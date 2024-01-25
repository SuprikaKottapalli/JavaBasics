public class Decrement13 {
    public static void main(String[] args) {
        int a = 5;
        int b = --a;//pre-drecrement operator 1st changed then used
        System.out.println(a);
        System.out.println(b);

        System.out.println("...........");
        
        int c = 5;
        int d = a--;//post-drecement operator 1st used then changed
        System.out.println(c);
        System.out.println(d);
    }
}
