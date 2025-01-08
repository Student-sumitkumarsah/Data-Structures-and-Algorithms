public class rotateArrayByDPlace {
    public static void rotate(int arr[],int k){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        //arr=temp;
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        
        
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        

        rotate(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
    
}
