import java.util.*;
public class AreaOfCircle7 {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    float radius = sc.nextFloat();
    float area = 3.14f * radius * radius;// "f" beside num indicates that the value is float if "f" is not written the java conciders the value as double
    System.out.println(area);
    }
}
