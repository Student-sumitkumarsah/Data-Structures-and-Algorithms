public class getithBit {
    public static int get(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n=4;
        int i=4;
        int ans=get(n, i);
        System.out.println(ans);

        
    }
    
}
