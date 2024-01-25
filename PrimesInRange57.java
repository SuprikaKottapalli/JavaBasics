public class PrimesInRange57 {
    //check prime or not
    public static boolean PrimeNum(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    //Printing Range
    public static void PrimesInRange(int n){
        for(int i = 2; i< n ; i++){
            if(PrimeNum(i)){
                System.out.print(i+" ");
            }
        }
      //  System.out.println();
    }

    //main Function
    public static void main(String[] args) {
       PrimesInRange(100);
    }


}
