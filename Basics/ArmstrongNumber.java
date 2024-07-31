// package Basics;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 847339;
        int newNum = checkArmstrongNumber(n);
        System.out.println(n);
        System.out.println(newNum);
        if(n == newNum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong number!");
        }
    }

    private static int checkArmstrongNumber(int n) {
        int temp = n;
        int newNum = 0;
        int numOfDigits = 0;

        while (temp > 0) {
            numOfDigits++;
            temp = temp/10;
        }
        
        while (n>0) {
            int rem = n%10;
            newNum += Math.pow(rem, numOfDigits);
            n = n/10;
        }
        return newNum;
    }
}