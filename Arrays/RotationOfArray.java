

public class RotationOfArray {

    public static void main(String[] args) {
        int[] arr = {45, 25, 96, 3, 94, 44, 3, 89, 69};
        int n = arr.length;

        // 1) Left Rotation by 1 place......
        // int k = 1;
        // leftRotateByOne(arr, n, k);

        
        // 1) Left Rotation by k place......
        int k = 11;
        leftRotateByK(arr, n, k);
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void reverse(int[] arr, int i, int j ){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void leftRotateByK(int[] arr, int n, int k) {

        // 1) BRUTEFORCE APPROACH :-
        // k = k%n;
        // List<Integer> tempList = new ArrayList<>();
        // for (int i = 0; i < k; i++) {
        //     tempList.add(arr[i]);
        // }

        // // placing the remaining elements
        // for (int i = k; i < n; i++) {
        //     arr[i - k] = arr[i];
        // }

        // // now put back the remaining values from tempList to their places
        // for (int i = 0; i < tempList.size(); i++) {
        //     arr[n - k + i] = tempList.get(i);
        // }


        // 2) OPTIMAL APPROACH :-----
        k = k%n;

        // reverse the element upto k
        reverse(arr, 0, k-1);

        // reverse the element starting from k to last
        reverse(arr, k, n-1);

        // at last reverse the whole array
        reverse(arr, 0, n-1);
    }



        
    // private static void leftRotateByOne(int[] arr, int n, int k) {
    //     int temp = arr[0];
    //     for(int i = 1; i<n; i++){
    //         arr[i-1] = arr[i];
    //     }
    //     arr[n-1] = temp;
    //     for(int element : arr){
    //         System.out.println(element);
    //     }
    // }
}
