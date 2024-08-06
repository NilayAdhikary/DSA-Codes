
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {28, 39, 3, 48, 250, 387, 387, 18, 224, 39, 388};
        // int[] arr = {10, 10, 10, 10, 10};
        
        int n = arr.length;
        findSecondLargest(arr, n);
    }

    private static void findSecondLargest(int[] arr, int n) {
        
        // 1) BruteForce Approach:

        // Arrays.sort(arr);
        // int secLargest = 0;
        // int largest = arr[n-1];
        // System.out.println("Largest element = " +largest);
        // for(int i = n-2; i>=0; i--){
        //     if(arr[i] != largest){
        //         secLargest = arr[i];
        //         break;
        //     }
        // }
        // System.out.println("Second largest element = " +secLargest);


        // 2) Optimal Approach :
        int max = arr[0]; //10
        int secMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println("The second Largest element is : " + secMax);
    }
}
