public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {38, 439, 698, 32, 352, 592, 7735, 363};
        int n = arr.length;
        reverseArr(arr, 0, n-1);
        for(int element : arr){
            System.out.println(element);
        }
    }

    private static void reverseArr(int[] arr, int start, int end) {
        // for(int i = 0; i<n/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
