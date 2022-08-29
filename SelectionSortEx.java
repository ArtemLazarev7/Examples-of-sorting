package SortedEx;

public class SelectionSortEx {
    public static void main(String[] args) {
        int [] arr={12, 39, 25, 14, 86, 13, 6, 42};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minIndex]>arr[j])
                    minIndex=j;
            }
            swap(i,minIndex,arr);
        }
    }
    private static void swap(int i, int minIndex, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
}
