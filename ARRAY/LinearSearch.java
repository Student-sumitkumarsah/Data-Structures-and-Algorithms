public class LinearSearch {
    public static int linearSearch01(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1; // this line are say your given key is not exit in this array

    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=19;
        
        
        int index=linearSearch01(number, key);
        if(index==-1){
            System.out.println("key is not found");
        }
        else{
            System.out.println("key is found And Present this Index = "+" "+index);
        }
        
    }
    
}
