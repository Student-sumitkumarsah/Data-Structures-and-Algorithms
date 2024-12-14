public class removeDuplicate {
    public static int duplicat(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
            
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,2,2,3,3};
        int ans=duplicat(arr);
        System.out.println(ans);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
