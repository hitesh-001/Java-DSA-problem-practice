import java.util.Scanner;
public class Check_Palindrome {
    public static void checkPalindrom(String str){
        int s=0;
        int e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                System.out.println("Not Palindrome");
                return;
            }
            s++;
            e--;
        }
        System.out.println("Palindrome");
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        checkPalindrom(str);

    }
}
