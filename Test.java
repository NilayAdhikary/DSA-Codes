public class Test {
    public static int reverseNumber(int n){
        int temp = n;
        if(n<0){
            n = n*(-1);
        }

        int revNumber = 0;
        while (n>0) {
            int rem = n%10;
            if(revNumber>Integer.MAX_VALUE/10 || revNumber<Integer.MIN_VALUE/10){
                return 0;
            }
            revNumber = revNumber*10+rem;
            n = n/10;
        }
        if(temp < 0){
            revNumber = revNumber*(-1);
        }
        return revNumber;
    }
    public static void main(String[] args) {
        int n = -1147483641;
        int rev = reverseNumber(n);
        System.out.println("The reverse of " + n + " is " + rev);
    }
}
