package SortedEx;

import java.awt.event.WindowFocusListener;

public class QuickSortEx {
    public static void main(String[] args) {
        int [] arr={12, 39, 25, 14, 86, 13, 6, 42};
        quickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void quickSort(int [] arr,int l,int r){
        if (l>=r) return;
        int pi=partition(arr,l,r);
        quickSort(arr,l,pi-1);
        quickSort(arr,pi+1,r);
    }
    private static int partition(int[] arr, int l, int r) {
        int pivot=arr[r];
        int ptr=l-1;
        for (int i = l; i < r; i++) {
            if (arr[i]<pivot){
                ptr++;
                swap(ptr,i,arr);
            }
        }
        swap(ptr+1,r,arr);
        return  ptr+1;
    }
    private static void swap(int ptr, int i, int[] arr) {
        int temp=arr[ptr];
        arr[ptr]=arr[i];
        arr[i]=temp;
    }
}
