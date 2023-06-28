import java.util.Scanner;

public class ReverseStringWord{
    public static String reverseStringWord(String str){
        String ans="";
        int currentstartind=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans=str.substring(currentstartind, i)+ans;
                currentstartind=i+1;
            }
            if(i==str.length()-1){
                ans=str.substring(currentstartind, i+1)+" "+ans;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reverse=reverseStringWord(str);
        System.out.println(reverse);
    }
}