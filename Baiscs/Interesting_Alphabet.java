import java.util.Scanner;

public class Interesting_Alphabet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            char ch=(char)('A'+n-1-i);
            for(int j=0;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }System.out.println();
        }
    }
}
