public class secondLargestValue {
    public static int findMax(int arr[]){
        int max=(Integer.MIN_VALUE);
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int SecondlargestValue(int arr[]){
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                arr[i]=(Integer.MIN_VALUE);
            }
        }

        int SecondlargeValue=findMax(arr);
        return SecondlargeValue;
    }
    public static void main(String[] args) {
        int arr[]={9,8,9,6,9,5,8};
        int FinalAns=SecondlargestValue(arr);
        System.out.println(FinalAns);
    }
    
}
