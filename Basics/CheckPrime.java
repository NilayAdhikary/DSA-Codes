package Basics;
public class CheckPrime {
    public static void main(String[] args) {
        int n = 89;
        checkPrime(n);
    }

    private static void checkPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if(i != n/i){
                    count++;
                }
            }
        }
        System.out.println("Total no of divisors = " + count);
        if(count == 2){
            System.out.println("It is prime number!");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
