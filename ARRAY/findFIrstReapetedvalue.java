public class findFIrstReapetedvalue {
    public static int reapetValue(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1,3,8,4};
        int ans=reapetValue(arr);
        System.out.println(ans);
    }
    
}
