public class checkPalindrom {
    public static boolean check(String str){
        int n=str.length();
        boolean result=false;
        for(int i=0;i<n/2;i++ ){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                result= true;
                return result;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String str="raceecar";

        // This Program Approach 

        //  Step 1- given String divide Two Part and compare first and last character 
        // ending of loop mid part  

        
        boolean ans=check(str);
        if(ans==false){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
    
}
