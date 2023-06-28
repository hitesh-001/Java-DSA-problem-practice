public class Toggle {
    public static void main(String args[]){
        String s1="abC";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                System.out.print((char)(s1.charAt(i)+32));
            }else{
                System.out.print((char)(s1.charAt(i)-32));
            }
        }
    }
}
