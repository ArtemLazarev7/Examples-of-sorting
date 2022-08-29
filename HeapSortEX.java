package SortedEx;

public class HeapSortEX {
    public static void main(String[] args) {
        int [] arr={12,39,25,14,86,13,6,42};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    private static void heapSort(int[] arr) {
        for (int i = arr.length/2-1; i >=+0 ; i--)
            heapify(arr,i,arr.length);
        for (int i = arr.length-1; i >=0 ; i--) {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,0,i);
        }
    }
    private static void heapify(int[] arr, int i, int length) {
        int l=i*2+1;
        int r=i*2+2;
        int largest=i;
        if (l<length&&arr[l]>arr[largest])
            largest=l;
        if (r<length&&arr[r]>arr[largest])
            largest=r;
        if (i!=largest){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,largest,length);
        }
    }
}
