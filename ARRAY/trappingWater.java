public class trappingWater {
    public static void trappRainWater(int height[]){
        // first I calculate the leftMax Boundary
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++ ){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }


        // Second I calculate the RightMax Boundary

        int rightMax[]=new int [n];
         rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i-- ){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }


        // find the Trap water
        int trapWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trapWater+=waterlevel-height[i];
            
        }
        System.out.print(trapWater);
    
    }
    public static void main(String[] args) {
      int height[]={4,2,0,6,3,2,5};
      trappRainWater(height);
    }
    
}
