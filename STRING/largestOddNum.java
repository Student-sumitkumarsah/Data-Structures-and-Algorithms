public class largestOddNum {
    public static void longest(String num){
        int n=num.length()-1;
        for(int i=n;i>=0;i--){
            int d=num.charAt(i)-'0';
            if(d%2!=0){
                System.out.println(num.substring(0, i+1));
                return;
            }
            
        }
        System.out.println("");

    }
    public static void main(String[] args) {
        String num="4206";
        longest(num);
       
    }
    
}
