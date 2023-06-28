import java.util.*;
public class String_Compression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int i=0;
        
        while(i<s1.length()){
            int cnt=0;
            for(int j=i;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    cnt++;
                }
            }
            System.out.print(s1.charAt(i));
            System.out.print(cnt);
            i=i+cnt;
        }
        
    }
}
