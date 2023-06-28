import java.util.Scanner;

public class ReplaceCharacter {
    public static String replaceCharacter(String str,char c1,char c2){
        if(str.isEmpty()){
            return str;
        }
        String ans="";
        if(str.charAt(0)==c1){
            ans=ans+c2;
        }else{
            ans+=str.charAt(0);
        }
        return ans+replaceCharacter(str.substring(1), c1, c2);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c1=s.next().charAt(0);
        char c2=s.next().charAt(0);
        System.out.println(replaceCharacter(str,c1,c2));
    }
}
