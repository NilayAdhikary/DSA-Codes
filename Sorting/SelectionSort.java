package Sorting;

public class SelectionSort {
    private static void doSelectionSort(int[] arr, int n) {
        for(int i = 0; i<n-1; i++){
            int minIndex = i; //My minimum number appears at index i after every iteration of i;
            
            for(int j = i; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Now swap the value of index i with the value at minimum index.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] arr = {28, 39, -3, 48, 0, 387, -224, 39};
        int n = arr.length;
        doSelectionSort(arr, n);
    }
}
