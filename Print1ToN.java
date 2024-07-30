public class Print1ToN {

    // Print numbers from 1 to n....
    static void printNos(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNos(n-1);
    }

    // sum of first N numbers-----------------
    static int makeSum(int N){
        if(N == 0){
            return 0;
        }
        return N+makeSum(N-1);
    }

    public static void main(String[] args) {
        int n = 10;
        // printNos(n);
        int sum = makeSum(n);
        System.out.println("Sum of 1 to n is " + sum);
    }
}