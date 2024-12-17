import java.util.*;
public class create2Darray {
    public static void create(int arr[][]){
        Scanner sc=new Scanner(System.in);
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter the value = ");
                arr[i][j]=sc.nextInt();  
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        create(arr);
    }
    
}
