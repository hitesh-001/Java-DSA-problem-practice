import java.util.Scanner;
public class Reverse_String {
    public static String reverseString(String str){
        String ans="";
        // for(int i=str.length()-1;i>=0;i--){
        //     ans+=str.charAt(i);
        // }
        for(int i=0;i<str.length();i++){
            ans=str.charAt(i)+ans;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String newString=reverseString(str);
        System.out.println(newString);
    }
}
