import java.util.*;
import java.util.Scanner;
public class Bill10{
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int pencil = ab.nextInt();
        int pen = ab.nextInt();
        int eraser = ab.nextInt();
        float Bill = (pencil+pen+eraser);
        float finalBill = Bill+(Bill * 0.18f);
        System.out.println("Bill+Gst="+finalBill);
    }
}