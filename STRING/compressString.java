public class compressString {
    public static void compress(StringBuilder sb, String str){
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
            
        }
        System.out.println(sb);
       
    }
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String str="aaabbbbcd";
        compress(sb, str);
    }
    
}
