import java.util.Scanner;
public class Print_char{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}