public class QuickSort {
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partition(int a[],int si,int ei){
        int pivot=a[si];
        int count=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<=pivot){
                count++;
            }
        }
        swap(a,si,si+count);
        int i=si;
        int j=ei;
        while(i<si+count && j>si+count){
            if(a[i]<pivot){
                i++;
            }else{
                if(a[j]>pivot){
                    j--;
                }
                else{
                    swap(a,i,j);
                }
            }
        }
        return si+count;
    }
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotPos=partition(a,si,ei);
        quickSort(a,si,pivotPos-1);
        quickSort(a,pivotPos+1,ei);
        
    }
    public static void main(String args[]){
        int arr[]={4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
