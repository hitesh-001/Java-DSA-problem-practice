import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n*2-2*i;j>0;j--){
                System.out.print("  ");
            }
            int temp=i+1;
            int k=i+1;
            for(int j=0;j<i*2+1;j++){
                System.out.print(k+" ");
                if(k==i*2+1){
                    break;
                }
                k++;
            }
            k--;
            for(int j=k;j>=temp;j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
