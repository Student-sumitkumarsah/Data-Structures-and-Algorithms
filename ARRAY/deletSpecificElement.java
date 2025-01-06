public class deletSpecificElement {
    public static void deletElement(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
            

        }

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int target=40;
        
        deletElement(arr, target);

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
