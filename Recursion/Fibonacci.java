import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int ans=fibo(num);
        System.out.println(ans);
    }
}
