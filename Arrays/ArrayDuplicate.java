
import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5, 45, 5, 45, 3};
        // int[] arr = {1, 1, 2, 2, 2, 3, 3, 3};
        int n = arr.length;
        // hasDuplicate(arr, n);
        int uniqueElements = noOfUniqueElements(arr, n);
        System.out.println("The number of unique elements = " + uniqueElements);
    }

    private static int noOfUniqueElements(int[] arr, int n) {
        // You will be given a sorted array and from there you have to find no of unique elements
        // e.g. [1, 1, 1, 2, 3, 3, 4, 5, 5, 5, 5, 6]  => [1,2,1,1,3,3,4,5,5,....]
        // op. is 6 as [1, 2, 3, 4, 5, 6, ....place remaining elements there....]

        Arrays.sort(arr);

        // 1) BRUTEFORCE APPROACH :-----
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i<n; i++){
        //     set.add(arr[i]);
        // }
        // return set.size();

        // ------------------------------------------------------------------------------------------------------

        // 2) OPTIMAL APPROACH :-------
        int i = 0;
        int j = 1;
        while (j < n) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            } 
            j++;
        }
        return (i+1);
    }

    // private static void hasDuplicate(int[] arr, int n) {
    //     Set<Integer> set = new HashSet<>();
    //     for(int i = 0; i<n; i++){
    //         if(!set.contains(arr[i])){
    //             set.add(arr[i]);
    //         }else{
    //             System.out.println(arr[i] + " is a duplicate element!!");
    //         }
    //     }
    //     System.out.println(set);
    // }
}
