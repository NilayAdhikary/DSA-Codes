
public class GCD {
    public static void main(String[] args) {
        int a = 52, b = 10;
        int gcd = findGcd(a,b);
        System.out.println("GCD = " + gcd);
    }

    public static int findGcd(int a, int b){

        // Using Brute-force algo------------
        // int min = Math.min(a, b);
        // for(int i = min; i>=1; i--){
        //     if(a%i == 0 && b%i == 0){
        //         return i;
        //     }
        // }
        // return 1;

        // Using Eculedian Algorithm--------------------
        // (10,52) -> (52,10) -> (2,10) -> (10,2) -> (0,2)
        // (360,210) -> (150,210) -> ()
        while(a>0 || b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
            if(a == 0) return b;
            else return a;
        }
        return b;
    }
}
