
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {28, 39, 3, 48, 250, 387, 387, 18, 224, 39, 388};
        // int[] arr = {10, 10, 10, 10, 10};
        
        int n = arr.length;
        findSecondLargest(arr, n);
        findSecondSmallest(arr, n);
    }

    private static void findSecondSmallest(int[] arr, int n) {

        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;


        // Sol -1 ) Better Solution :
        // T.c. -> O(N+N) = O(2N);

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] < smallest) {
        //         smallest = arr[i];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] < secSmallest && arr[i] > smallest) {
        //         secSmallest = arr[i];
        //     }
        // }


        // Sol - 2 ) Optimal Solution :
        // T.c. -> O(N)

        for(int i = 0; i<n; i++){
            if(arr[i] < smallest){
                secSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secSmallest && arr[i] != smallest){
                secSmallest = arr[i];
            }
        }

        System.out.println("Smallest Elemnt = " + smallest);
        System.out.println("Second Smallest Elemnt = " + secSmallest);

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
