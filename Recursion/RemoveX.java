import java.util.Scanner;

public class RemoveX {

    public static String removeX(String str){
        if(str.isEmpty()){
            return str;
        }
        String ans="";
        if(str.charAt(0)!='x'){
            ans = ans + str.charAt(0);
        }
        return ans+removeX(str.substring(1));
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(removeX(str));
    }
}
