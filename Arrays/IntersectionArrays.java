
import java.util.ArrayList;

public class IntersectionArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 6, 7, 18, 19, 19, 35};
        int[] b = {1, 2, 4, 5, 5, 7, 8, 19, 25, 35};
        // int[] b = {1, 3, 5, 6, 6, 7, 18, 19, 19, 35};
        ArrayList<Integer> interArr = findInterArray(a, b, a.length, b.length);
        if (interArr.isEmpty()) {
            System.out.println("No common elements are there!!");
        } else {
            for (int element : interArr) {
                System.out.print(element + " ");
            }
        }
    }

    private static ArrayList<Integer> findInterArray(int[] a, int[] b, int m, int n) {

        // 1) BruteForce : -------------------------
        // T.C. -> Almost O(m*n) for worst case and O(m) for best case when a[i] < b[0] for all i;
        // S.C. -> O(m) or O(n) for worst case and O(1) for best case when no element is common.
        // ArrayList<Integer> interArr = new ArrayList<>();
        // for (int i = 0; i < m; i++) {
        //     if (a[i] >= b[0] && (interArr.isEmpty() || interArr.get(interArr.size() - 1) != a[i])) {
        //         for (int j = 0; j < n; j++) {
        //             if (a[i] == b[j]) {
        //                 interArr.add(b[j]);
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return interArr;
        // 2) Optimal --------------------------------------------------
        ArrayList<Integer> interArr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (a[i] >= b[j]) {
                if (a[i] == b[j]) {
                    if(interArr.isEmpty() || interArr.get(interArr.size() - 1) != a[i]){
                        interArr.add(a[i]);
                    }
                    i++;
                }
                j++;
            } else {
                i++;
            }
        }
        return interArr;
    }
}
