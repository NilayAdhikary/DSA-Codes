
public class BubbleSort {
    private static void doBubbleSort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            boolean didSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }
        }
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 28, 39, -3, 48, 0, 387, -224, 39 };
        // int[] arr = { 1,2,3,4,5 };
        int n = arr.length;
        doBubbleSort(arr, n);
    }

}
