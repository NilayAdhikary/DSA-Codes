package Basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {
    public static void main(String[] args) {
        int n = 91;
        showDivisors(n);
    }

    private static void showDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        // T.c. -> O(sqrt(n));
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if(n/i != i){
                    divisors.add(n / i);
                }
            }
        }

        // T.c. -> O(nlogn); where n is the total no of factors of the given number n;
        Collections.sort(divisors);

        // T.C. -> O(n);
        System.out.println(divisors);

        // So total t.c. is O(sqrt(n))+ O(nlogn) + O(n)
    }
}
