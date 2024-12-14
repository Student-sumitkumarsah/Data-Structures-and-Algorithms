public class selectionSort {
    public static int[] selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
        return arr;
       
    }
    public static void main(String[] args) {
        int arr[]={3,9,2,6,4,8};
        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");    
        }
    }
    
}
