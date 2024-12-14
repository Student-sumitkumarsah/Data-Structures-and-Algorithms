public class bubbleSort {
    public static void bubble(int arr[]){
        //int n=arr.length;
        int temp;
        for(int i=0;i<arr.length;i++){
            boolean check=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    check=true;
                }
            }
            if(check==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,9,2,6,4,8};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
