import java.util.Scanner;

public class RemoveConsecutiveDuplicate {

    public static String removeConsecutiveDuplicate(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeConsecutiveDuplicate(str.substring(1));

        }
        else{
            return str.charAt(0)+removeConsecutiveDuplicate(str.substring(1));

        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(removeConsecutiveDuplicate(str));
    }
}
