import java.util.Scanner;

public class transepseOfMatrix {
    public static void transeposeMatrix(int arr1[][],int r1,int c1){
        int transe[][]=new int [c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                transe[i][j]=arr1[j][i];
            }
           
        }
        System.out.println();
        for(int i=0;i<transe.length;i++){
            for(int j=0;j<transe[0].length;j++){
                System.out.print(transe[i][j]+" ");
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
        transeposeMatrix(arr1, r1, c1);
        
    }
    
}
