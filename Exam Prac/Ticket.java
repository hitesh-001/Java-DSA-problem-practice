import java.util.*;
public class Ticket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pre=sc.nextInt();
        int john=sc.nextInt();
        int mike=sc.nextInt();
        if(john<=pre){
            System.out.println("John:ticket Booked:"+john);
            if(mike<=pre-john){
                System.out.println("Mike:ticket Booked:"+mike);
            }else{
                System.out.println("Mike:Not Booked:");   
            }
        }else{
            System.out.println("John:Not Booked:");
            if(mike<=pre){
                System.out.println("Mike:ticket Booked:"+mike);
            }else{
                System.out.println("Mike:Not Booked:");   
            }
        }

    }
}
