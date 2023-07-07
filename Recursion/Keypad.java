import java.util.Scanner;

public class Keypad {
    public static String getString(int i){
        if(i==2){
            return "abc";
        }
        if(i==3){
            return "def";
        }
        if(i==4){
            return "ghi";
        }
        if(i==5){
            return "jkl";
        }
        if(i==6){
            return "mno";
        }
        if(i==7){
            return "pqrs";
        }
        if(i==8){
            return "tuv";
        }
        if(i==9){
            return "wxyz";
        }
        return "";
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
    }
}
