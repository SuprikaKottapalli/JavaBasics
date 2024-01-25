import java.util.*;
public class TerneryOpeater19 {
    public static void main(String[] args) {
        //ternery opertor
        
        //case1
        int a = 7;
        String type = ( a % 2 == 0 )? "even" : "odd" ;
        System.out.println(type);

        //case1
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        String actual_age = (Age>=13 && Age<=18 )? "Teen" : "Not Teen";
        System.out.println(actual_age);

        //case3
        Scanner sc1 = new Scanner(System.in);
        int marks = sc1.nextInt();
        String result = (marks>=33)? "Pass" : "Not pass";
        System.out.println("Your result is: "+result);



    }
}
