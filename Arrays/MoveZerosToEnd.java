public class MoveZerosToEnd {
    public static void main(String[] args) {
        // int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        // int[] arr = {0, 576, 3, 0, 0, 655, 0, 678, 20, 780, 5, 0, 0};
        int[] arr = {1, 0, 3, 0, 0, 655, 0, 678, 20, 780, 5, 10, 0};
        // int[] arr = {0, 0, 0, 0, 0};
        // int[] arr = { 1, 2, 3, 4, 5 };

        moveZerosAtEnd(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void moveZerosAtEnd(int[] arr, int n) {

        // Approach:- 1 (BruteForce approach) -----
        int[] tempArr = new int[n];
        int ind = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                tempArr[ind] = arr[i];
                ind++;
            }
        }
        for(int i = 0; i<n; i++){
            arr[i] = tempArr[i];
        }

        // Approach:- 2 (better approach) ----------------------
        // boolean allZero = true;
        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i] != 0) {
        //         continue;
        //     } else if (arr[i] == 0) {
        //         for (int j = i + 1; j < n; j++) {
        //             if (arr[j] == 0) {
        //                 continue;
        //             } else {
        //                 allZero = false;
        //                 int temp = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = temp;
        //                 break;
        //             }
        //         }
        //     }
        //     if (allZero) {
        //         System.out.println("The array contains zeros only!!");
        //         break;
        //     }
        // }


        // Approach:- 3 (Optimal) -----------------------

        // int i = 0; // i tracks 0
        // int j = 1; // j tracks non-zero elements.
        // while(j<arr.length){
        //     if(arr[i] != 0){ //that means the position of the i-th element is correct. So increase both.
        //         i++;
        //         j++;
        //     }else if(arr[j] == 0){ //that means we have increase j(not i) to find first non-zero element
        //         j++;
        //     }else{
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }
        // }

    }
}