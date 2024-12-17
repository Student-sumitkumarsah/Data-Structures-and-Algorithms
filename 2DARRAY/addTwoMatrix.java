import java.util.*;
public class addTwoMatrix {
    public static void addittion(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("user give the Worng parameter");
            return;
        }
        int sum[][]=new int[r1][c1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }

        }
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row No for matrix 1 = ");
        int r1=sc.nextInt();
        System.out.print("Enter column No for matrix 1 = ");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("For matrix 2");
        System.out.print("Enter row No for matrix 2 = ");
        int r2=sc.nextInt();
        System.out.print("Enter column2 No for matrix 2 = ");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        
        addittion(arr1, r1, c1, arr2, r2, c2);
        
    }
    
}
