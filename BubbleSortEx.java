package SortedEx;

public class BubbleSortEx {
    public static void main(String[] args) {
        int [] arr={12,39,25,14,86,13,6,42};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
