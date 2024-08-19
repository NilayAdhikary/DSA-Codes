package BirarySearch;

public class RecursiveSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 18, 25, 33, 97, 113 };
        int low = 0;
        int high = arr.length - 1;
        int k = 525;
        int ind = findElement(arr, k, low, high);
        if (ind != -1) {
            System.out.println("Element Found!!");
        } else {
            System.out.println("Element not found!!");
        }
    }

    private static int findElement(int[] arr, int k, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] > k) {
            return findElement(arr, k, low, mid - 1);
        } else if (arr[mid] < k) {
            return findElement(arr, k, mid + 1, high);
        } else {
            return mid;
        }
    }
}
