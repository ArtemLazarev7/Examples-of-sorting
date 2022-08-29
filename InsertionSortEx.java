package SortedEx;

public class InsertionSortEx {
    public static void main(String[] args) {
        int[] arr = {12, 39, 25, 14, 86, 13, 6, 42};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }

//        for (int i = 1; i < arr.length; i++) {
//            int curr = arr[i];
//            int j;
//            for (j = i - 1; j >= 0 && arr[j] > curr; j--) {
//                arr[j + 1] = arr[j];
//
//            }
//            arr[j + 1] = curr;
//        }
    }
}
