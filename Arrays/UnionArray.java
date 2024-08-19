import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        int a[] = {1,2,2,4,7,8,8,9};
        int b[] = {2,3,3,4,6,9,9,12};
        ArrayList<Integer> unionArr = findUnionArray(a,b,a.length,b.length);
        System.out.print("Union Array : ");
        for(int element : unionArr){
            System.out.print(element + " ");
        }
    }

    private static ArrayList<Integer> findUnionArray(int[] a, int[] b, int n, int m) {

        // 1) BruteForce:----------------------------

        // T.C -> O(n*logk + m*logk + (n+m)) where k is the dynamic length of the set as the number of elements in the set changes with each iteration.
        // S.c. -> O(m+n + m+n) i.e. O(2(m+n))....

        // TreeSet<Integer> set = new TreeSet<>();
        // for(int i = 0; i<n; i++){
        //     set.add(a[i]);
        // }
        // for(int i = 0; i<m; i++){
        //     set.add(b[i]);
        // }
        // ArrayList<Integer> unionArr = new ArrayList<>(set);
        // return unionArr;

        // 2) Optimal : ---------------------------------
        // use two pointer approach....

        // T.c. -> O(m+n) for the first while loops
        // S.C. -> O(m+n) for the worst case, when all the elements are unique in both the arrays.

        ArrayList<Integer> unionArr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(a[i] <= b[j]){
                if (unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            if (unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }
        return unionArr;
    }
}
