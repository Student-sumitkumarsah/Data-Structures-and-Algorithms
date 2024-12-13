public class findLargestNum {
    public static int  largest(int arr[]){
        int largestNum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNum){
                largestNum=arr[i];
            }
        }
        return largestNum;
    }
    public static void main(String[] args) {
       int arr[]={1,2,6,3,5};
       System.out.print("Our largest value = "+largest(arr));
      
        
        
    }
    
}