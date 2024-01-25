public class Switch21 {
    public static void main(String[] args) {
        int num = 3;//we can use other data types also
        switch (num) {
            case 1:
                System.out.print("Fan");
                break;//if we dont write break then all case under the true case will excute
            case 2:
                System.out.println("Light");
                break;
            case 3:
                System.out.println("Table lamp");
                break;
            case 4:
                System.out.println("Nothing");
                break;
             
            default:
                System.out.println("I m not in ur switch board!!");
                break;
        }
        System.out.println("************another datatype**************");
        char abc = 'a';
        switch (abc){
            case 'a':
                System.out.println("I m A");
                break;
            case 'b' :
                System.out.println("I m B");
                break;
            case 'c' :
                System.out.println("I m C");
                break;

            default:
            System.out.println("I m not in ur option!!");
        }

      
        

    }
}