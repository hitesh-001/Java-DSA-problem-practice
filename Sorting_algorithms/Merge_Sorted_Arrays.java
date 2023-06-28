import java.util.Scanner;
public class Merge_Sorted_Arrays {
    public static int[] mergeArray(int a1[],int a2[]){
        int result[]=new int[a1.length+a2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                result[k]=a1[i];
                i++;
                k++;
            }else{
                result[k]=a1[j];
                j++;
                k++;
            }
        }
        while(i<a1.length){
             result[k]=a1[i];
                i++;
                k++;
        }
        while(j<a2.length){
             result[k]=a2[j];
                j++;
                k++;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Size1: ");
        int n1=s.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter Array1: ");
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }
        System.out.print("Enter Size2: ");
        int n2=s.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter Array2: ");
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }
        int result[]=new int[n1+n2];
        result=mergeArray(arr1,arr2);
        for(int i=0;i<n1+n2;i++){
            System.out.println(result[i]);
        }
    }
}
