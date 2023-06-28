import java.util.Scanner;

public class SumOfNaturalNumber {
    public static int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturalNumber(n-1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int ans=sumOfNaturalNumber(num);
        System.out.println(ans);
    }
}
