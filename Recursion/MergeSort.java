public class MergeSort {
    public static void merge(int a[],int si,int ei){
        int size=ei-si+1;
        int mid=(si+ei)/2; 
        int out[]=new int[size];
        int i=si;
        int j=mid+1;
        int index=0;
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                out[index]=a[i];
                i++;
                index++;
            }else{
                out[index]=a[j];
                j++;
                index++;
            }
        }
        while(i<=mid){
            out[index]=a[i];
            i++;
            index++;
        }
        while(j<=ei){
            out[index]=a[j];
            j++;
            index++;
        }
        int m=0;
        for(i=si;i<=ei;i++){
            a[i]=out[m];
            m++;
        }
    }
    public static void mergeSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(a,0,mid);
        mergeSort(a,mid+1,ei);
        merge(a,si,ei);
        
    }
    public static void main(String args[]){
        int arr[]={3,2,1,4};
        mergeSort(arr,0,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
