package BirarySearch;

public class IterativeSearch {
    public static void main(String[] args){
        int[] arr = { 2, 5, 9, 18, 25, 33, 97, 113 };
        int k = 25;
        int ind = findElement(arr, arr.length, k);
        if (ind != -1) {
            System.out.println("Element Found!!");
        } else {
            System.out.println("Element not found!!");
        }
    }

    private static int findElement(int[] arr, int length, int k) {
       
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == k){
                return mid;
            } else if(arr[mid] < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
