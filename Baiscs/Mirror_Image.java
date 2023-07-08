import java.util.Scanner;

public class Mirror_Image {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while(i<n){
            int j=(n+2)-i*2;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            int k=1;
            j=0;
            while(j<=i){
                System.out.print(k+" ");
                k++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
