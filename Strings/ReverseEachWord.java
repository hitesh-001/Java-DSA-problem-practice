import java.util.Scanner;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ans="";
        int currentWordStart=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                int currentWordEnd=i-1;
                String reverseWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reverseWord=str.charAt(j)+reverseWord;
                }
                ans=ans+reverseWord+" ";
                currentWordStart=i+1;
            }
            if(i==str.length()-1){
                int currentWordEnd=i;
                String reverseWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reverseWord=str.charAt(j)+reverseWord;
                }
                ans=ans+reverseWord;
                currentWordStart=i+1;
            }
        }
        
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reverseWordString=reverseEachWord(str);
        System.out.println(reverseWordString);
    }
}
