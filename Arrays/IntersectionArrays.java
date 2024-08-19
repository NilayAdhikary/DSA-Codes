import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 4, 7, 8, 8, 9 };
        int b[] = { 2, 2, 3, 4, 6, 9, 9, 12 };
        // int b[] = { 10, 378, 3928, 4444, 5555 };
        ArrayList<Integer> interArray = findIntersectionArray(a, b, a.length, b.length);
        if (interArray.size() == 0) {
            System.out.println("No common elements found!!");
        } else {
            System.out.println("The intersection array : ");
            for (int element : interArray) {
                System.out.print(element + " ");
            }
        }
    }

    private static ArrayList<Integer> findIntersectionArray(int[] arr1, int[] arr2, int n, int m) {

        // 1) BruteForce :-------------------------

        // ArrayList<Integer> interArr = new ArrayList<>();
        // for(int i = 0; i<n-1; i++){
        // if(arr1[i] != arr1[i+1]){
        // for(int j = 0; j<m; j++){
        // if (arr1[i] == arr2[j]) {
        // if (interArr.size() == 0 || interArr.get(interArr.size()-1) != arr2[j]) {
        // interArr.add(arr2[j]);
        // }
        // }
        // }
        // }
        // }

        ArrayList<Integer> interArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] < arr2[j]) {
                    break;
                } else {
                    if (arr1[i] == arr2[j]) {
                        if (interArr.size() == 0 || interArr.get(interArr.size() - 1) != arr1[i]) {
                            interArr.add(arr1[i]);
                        }
                    }
                }
            }
        }

        return interArr;
    }
}
