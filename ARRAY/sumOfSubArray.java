public class sumOfSubArray {
    public static void sumOfsubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int add =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                add=0;
               for( int k=i;k<=j;k++){
                add+=arr[k];
               }
               System.out.println(add);
               if(maxSum<add){
                maxSum=add;
            }   
            }
        }
        System.out.println(maxSum);
       System.out.println("max sum is :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        sumOfsubArray(arr);

        
        
    }
    
}
