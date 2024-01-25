import java.util.*;
public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  PujithaCenterCode = sc.nextInt();
        int  ArunaCenterCode = sc.nextInt();
        int  OurCenterCode = sc.nextInt();
        if( PujithaCenterCode == OurCenterCode && ArunaCenterCode == OurCenterCode )
        {
            System.out.println("Bring Hall tickets :) ");
        }
        else
        {
            System.out.println("Don't bring :( ");
        }

      }
}
