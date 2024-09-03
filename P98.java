public class P98{
    static void  heapsort(int[] arr){
        buildMaxHeap(arr);
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }

    static void  heapify(int[] arr,int n,int i){
        int maxindex = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left] >arr[maxindex]){
            maxindex = left;
        }
        if(right<n && arr[right] >arr[maxindex]){
            maxindex = right;
        }
        if(i != maxindex){
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
            heapify(arr,i,n);
        }
    }
    static void buildMaxHeap(int[] arr){
        int n = arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }    
    public static void main(String[] args) {
        int[] arr = {67,89,23,567,34,6,2,86,34,9,3,790};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}