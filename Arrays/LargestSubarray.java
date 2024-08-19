import java.util.*;

public class LargestSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int k = 6;
        int length = findLargestSubarray(arr, k, arr.length);
        System.out.print("The length of the longest subarray is : " + length);
    }

    private static int findLargestSubarray(int[] arr, int k, int length) {

        // Good Approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int i = 0;
        // int maxLength = 0;
        // int sum = 0;
        // while (i<length) {
        // sum+=arr[i];
        // if(sum == k){
        // maxLength = i+1;
        // }
        // int rem = sum - k;
        // if(map.get(rem) != null){
        // int len = i - map.get(rem);
        // maxLength = Math.max(maxLength, len);
        // }
        // if(map.get(sum) == null){
        // map.put(sum, i);
        // }
        // i++;
        // }

        // return maxLength;

        // Optimal Approach (Valid Only when there is no negetive element in the array)
        int sum = arr[0], maxLength = 0, left = 0, right = 0;
        while (right < length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {2
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < length) {
                sum += arr[right];
            }
        }
        return maxLength;
    }
}
