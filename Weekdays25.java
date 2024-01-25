import java.util.*;
public class Weekdays25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weekday num [1(monday) to 7(sunday)]: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Its Monday today");
                break;
            case 2:
                System.out.println("Its Tuesday today");                
                break;                
            case 3:
                System.out.println("Its Wednesday today");                
                break;
            case 4:
                System.out.println("Its Thuesday today");                
                break;
            case 5:
                System.out.println("Its Friday today");                
                break;                                        
            case 6:
                System.out.println("Its Saturday today");                
                break;
            case 7:
                System.out.println("Its Sunday today");                
                break;

            default:
                System.out.println("This num in week doesnt exist");
                break;
        }

        
    }
}
