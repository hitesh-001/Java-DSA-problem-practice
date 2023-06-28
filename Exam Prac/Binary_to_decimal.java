import java.rmi.StubNotFoundException;

public class Binary_to_decimal {
    public static void main(String args[]){
        String s1="111";
        int ans=Integer.parseInt(s1,2);
        System.out.println(ans);
        int i=10;
        System.out.println(Integer.toBinaryString(i));
    }
}
