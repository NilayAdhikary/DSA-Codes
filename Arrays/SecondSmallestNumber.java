public class SecondSmallestNumber {

    public static void main(String[] args) {
        // int[] arr = {28, 39, 3, 48, 250, 387, 387, 18, 224, 39, 388};
        // int[] arr = {10, 10, 10, 10, 10};
        int[] arr = {1, 2, 3, 4, 5};
        
        int n = arr.length;
        findSecondSmallest(arr, n);
    }

    private static void findSecondSmallest(int[] arr, int n) {

        // Sol -1 ) Better Solution :----
        
        // T.c. -> O(N+N) = O(2N);

        // int smallest = arr[0];
        // int secSmallest = Integer.MAX_VALUE;
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
        // System.out.println("Second Smallest is : "+ secSmallest);
        
        // 2) Optimal Solution :---------

        // T.C. -> o(n)
        
        int min = arr[0];
        int secMin = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            }else if(arr[i] < secMin && arr[i] > min){
                secMin = arr[i];
            }
        }
        System.out.println("Second Min is : " + secMin);
    }
}