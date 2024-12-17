import java.util.*;
public class multiplyTwoMatrix {
    public static void multiply(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("multiplycation is not possibel beacuse dimension is worng");
            return;
        }
        int mul[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                     mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<mul.length;i++){
            for(int j=0;j<mul[i].length;j++){
                System.out.print(mul[i][j]+" ");
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



        multiply(arr1, r1, c1, arr2, r2, c2);
        
        
        
    }
    
}

