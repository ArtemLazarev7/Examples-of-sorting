package SortedEx;

public class MergeSortEx {
    public static void main(String[] args) {
        int [] arr={12, 39, 25, 14, 86, 13, 6, 42};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void mergeSort(int[] arr){
        if(arr.length==1)
            return;
        int mid=arr.length/2;
        int[] l=new int[mid];
        int [] r=new int[arr.length-mid];
        for (int i = 0; i < mid; i++)
            l[i]=arr[i];
        for (int i = mid; i < arr.length ; i++)
            r[i-mid]=arr[i];

        mergeSort(l);
        mergeSort(r);
        merge(arr,l,r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left=0;
        int right=0;
        int idx=0;
        while (left<l.length&&right<r.length) {
            if (l[left] < r[right]) {
                arr[idx] = l[left];
                left++;
                idx++;
            }else   {
                arr[idx]=r[right];
                right++;
                idx++;
            }
        }
        for (int i = left; i <l.length ; i++)
            arr[idx++]=l[i];
        for (int i = right; i <r.length ; i++)
            arr[idx++]=r[i];
            }
        }



