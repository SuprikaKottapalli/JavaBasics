import java.util.*; 
    public class SwitchCalculater22 {
        public static void main(String[] args) {
            System.out.println("Welcome To My Calculater Using Switch Statements");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your 1st num:");
            int a = sc.nextInt();
            System.out.print("Enter your 2nd num:");
            int b = sc.nextInt();
            System.out.print("Enter Operater('+','-','*','/','%'):");
            char Operater = sc.next().charAt(0);
            int c;


            switch (Operater) {
                case '+':
                    System.out.println(c=a+b);//we can assign value like this also
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break; 
                case '%':
                    System.out.println(a%b);
                    break;                                  
                default:
                    System.out.println("I am unable to perform this operation for this I need to grow more advance and I m learning");
                    break;
            }


            
        }
    
}


