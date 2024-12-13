public class findMissingNum {
    public static void missing(int arr[],int n){
        int sn=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=sum+arr[i];
        }

        int ans=sn-sum;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n=arr.length;
        missing(arr, n);
        
    }
    
}
