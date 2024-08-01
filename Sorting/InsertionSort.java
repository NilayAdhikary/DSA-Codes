package Sorting;

public class InsertionSort {
    private static void doInsertionSort(int[] arr, int i, int n) {

        // Approach 1: ITERATIVE APPROACH :-

        // for (int i = 1; i < n; i++) {

        //     for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
        //         System.out.println("Inner loop Runs...");
        //         int temp = arr[j];
        //         arr[j] = arr[j - 1];
        //         arr[j - 1] = temp;
        //     }
        // }

        
        // 2) RECURSIVE APPROACH : 

        if(i > n-1){
            return;
        }

        insert(arr, i);
        doInsertionSort(arr, i+1, n);
    }

    static void insert(int[] arr, int i){
        for(int j = i; j>0 && arr[j] < arr[j-1]; j--){
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 28, 39, -3, 48, 0, 387, -224, 39 };
        // int[] arr = { 14, 9, 15, 12, 6, 8, 13};
        // int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int startIndex = 1;
        doInsertionSort(arr, startIndex, n);
        for(int element : arr){
            System.out.println(element);
        }
    }

}
