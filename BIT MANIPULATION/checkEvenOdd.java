public class checkEvenOdd {
    public static void check(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("this number is even");
        }
        else{
            System.out.println("this number is odd");
        }
    }
    public static void main(String[] args) {
        check(3);
        check(2);
        check(15);
        
    }
    
}
