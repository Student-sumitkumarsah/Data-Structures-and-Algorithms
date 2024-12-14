import java.util.*;
public class inbuiltSort {
    
    public static void main(String[] args) {
        Integer arr[]={6,4,5,8,2};
        Arrays.sort(arr);     
        for(int var:arr){   // Ascending order
            System.out.print(var+" ");
        }
        System.out.println();

        Arrays.sort(arr,Collections.reverseOrder());
        for(int var:arr){           // Descendind order
            System.out.print(var+" ");
        }
    }
    
}
