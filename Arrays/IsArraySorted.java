
public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 4, 5};
        // int[] arr = {1};
        int n = arr.length;
        checkSorted(arr, n);
    }

    private static void checkSorted(int[] arr, int n) {
        for(int i = 0; i<n-1; i++){
            if(arr[i+1]<arr[i]){
                System.out.println("Array is not sorted!!");
                return;
            }
        }
        System.out.println("Array is sorted!!");
    }
}
