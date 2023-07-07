import java.util.Scanner;

public class FindSubsequences {
    public static String[] findSubsequences(String str){
        if(str.length()==0){
            String[] ans={""};
            return ans;
        }
        String smallAns[]=findSubsequences(str.substring(1));
        String ans[]=new String[2*(smallAns.length)];
        int k=0;
        for(int i=0;i<smallAns.length;i++){
            ans[k]=smallAns[i];
            k++;
        }
        for(int i=0;i<smallAns.length;i++){
            ans[k]=str.charAt(0)+smallAns[i];
            k++;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String ans[]=findSubsequences(str);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }System.out.println();
    }
}
