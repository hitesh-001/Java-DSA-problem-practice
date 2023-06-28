public class EquilibriumIndex {
    // public static void equilibriumIndex(int arr[]){
    //     int i=0;
    //     int j=arr.length-1;
    //     int sumstart=0;
    //     int sumend=0;
    //     while(i<j){
    //         sumstart+=arr[i];
    //         sumend+=arr[j];
    //         if(sumstart<sumend){
    //             i++;
    //         }else{
    //             j--;
    //         }
    //     }
    //     if(sumstart==sumend){
    //         System.out.println(i);
    //     }
    //     System.out.println(-1);
    // }


    public static void equilibriumIndex(int arr[]){
        int totalsum=0;
        int i=0;
        while(i<arr.length){
            totalsum+=arr[i];
            i++;
        }
        int leftsum=0;
        i=0;
        while(i<arr.length){
            int rightsum=totalsum-leftsum; 
            System.out.println(leftsum+"  "+rightsum);
            if(rightsum==leftsum){
                System.out.println(i);
                return;
            }
            leftsum+=arr[i];
            i++;
        }
        System.out.println(-1);
    }
    public static void main(String args[]){
        int arr[]={3,1,2,5,4,3,2,2};
        equilibriumIndex(arr);
    }
}
