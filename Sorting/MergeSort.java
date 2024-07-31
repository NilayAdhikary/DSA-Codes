package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    private static void doMergeSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;

        //This divides the left portion of the array to the deep 
        doMergeSort(arr, low, mid);

        // This divides the right portion of the array to the deep 
        doMergeSort(arr, mid+1, high);

        // This finally sorts and merge the arrays
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> tempArr = new ArrayList<>();

        // left array => [low ..... mid]
        // right array => [mid+1 ..... high]
        int left = low; //0
        int right = mid+1; //1

        while (left <= mid && right <= high) {
            if(arr[left] < arr[right]){
                tempArr.add(arr[left]);
                left++;
            }else{
                tempArr.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            tempArr.add(arr[left]);
            left++;
        }
        while (right <= high) {
            tempArr.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++){
            // i-low is done b/c since it is a temporary array list, so the indexing of this will always start from zero unlike the actual array so always get the element from index 0 first and then go on.
            // in actual array the starting index have to be low and should run till high;

            // 1st iteration -> i-low=low-low = 0
            // 2nd iteration -> i-low = low+1-low = 1;
            // 3rd iteration -> i-low = low+2-low = 2; and so on.....
            arr[i] = tempArr.get(i-low);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 28, 39, -3, 48, 0, 387, -224, 39, 309 };
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        doMergeSort(arr, low, high);
        for(int element : arr){
            System.out.println(element);
        }
    }
}
