import java.util.*; //importing requied java package
public class Input4 {
     public static void main(String[] args) {

        //single Word input
        Scanner sc = new Scanner(System.in); //Scanner is a class present in util package and "sc" is the object (name can be of ur choice),sys.in enables input
        String input = sc.next();//sc captures input with the help of function "next()" but this function terminates as we use space.This fun is used only words
        System.out.println(input);//This prints the value stored in input variable 
       
       //line or Paragraph input
        Scanner sc1 = new Scanner(System.in);
        String inp = sc1.nextLine();// "nextline()" is function which takes full line statements and paragraphs also
        System.out.println(inp); 

        //Integer input
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();//nextInt() also doesn't consider spaces
        System.out.println(num);

        //Float input
        Scanner sc3 = new Scanner(System.in);
        float flt = sc3.nextFloat();//nextFloat() is for floating point
        System.out.println(flt); 
    
        //Boolean input
        Scanner sc4 = new Scanner(System.in);
        boolean bloo = sc4.nextBoolean();//nextBoolean() is function to capture True or False 
        System.out.println(bloo); 
 
        //Short input 
        Scanner sc5 = new Scanner(System.in);
        short sht = sc5.nextShort();// It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        System.out.println(sht);//it doesn't consider spaces

        //Long input
        Scanner sc6 = new Scanner(System.in);
        long lg = sc6.nextLong();//long has a minimum value of (-2^63) and a maximum value of (2^63)-1.
        System.out.println(lg);//it doesn't consider spaces 

        //Double input
        Scanner sc7 = new Scanner(System.in);
        double dbl = sc7.nextDouble();//Double is capable of holding 64 bits of decimal numbers or floating points.
        System.out.println(dbl);
      }


}