
public class QuickSort{
    private static void doQuickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

        // int pivot = arr[low];
        // now place the pivot at it's correct position and return the index. So that from next steps left and right arrays of the pivot can be sorted.
        int pivotIndex = placePivot(arr, low, high);

        // this is the left side array of pivot.
        doQuickSort(arr, low, pivotIndex-1);

        // this is the right side array of pivot.
        doQuickSort(arr, pivotIndex + 1, high);
    }
    private static int placePivot(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            // 4849,48,44,4,5,3,5
            // pivot = 4849;

            // i tracks the immediate bigger element than pivot
            // once it finds a bigger element than pivot, i stops there.
            while(i <= high && arr[i] <= pivot){
                i++;
            }

            // j tracks the immediate smaller element than pivot or equal to pivot. once it finds a smaller element than pivot, it stops there.
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            // now swap the position of the element at i and j index. Swap happens only when i<j as if i=j, then it points the same element. So no need to swap same element.
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot at that place where i=j;
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int[] arr = { 28, 39, -3, 48, 0, 387, -224, 39 };
        // int[] arr = { 1,2,3,4,5 };
        // int[] arr = { 4849, 48, 44, 24, 19, 7};
        int low = 0;
        int high = arr.length -1;
        doQuickSort(arr, low, high); 
        for(int element : arr){
            System.out.println(element);
        }
    }
}