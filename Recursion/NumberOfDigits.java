import java.util.Scanner;

public class NumberOfDigits {
    public static int noOfDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+noOfDigits(n/10);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int ans=noOfDigits(num);
        System.out.println(ans);
    }
}
