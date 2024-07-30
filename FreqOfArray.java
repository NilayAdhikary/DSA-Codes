import java.util.HashMap;
import java.util.Map;


public class FreqOfArray {
    int[] arr1 = new int[ (int) 1e6];
    public static void main(String[] args) {
        
        // 1) USING BRUTEFORCE APPROACH : 

        // int arr[] = { 2, 5, 37, 4, 2, 37, 9, 5, 2 };
        // int count = 0;
        // int num = 2;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] == num){
        //         count++;
        //     }
        // }
        // if(count == 0){
        //     System.out.println("The number doesn't apper in the array");
        // }
        // else{
        //     System.out.println("The number appears " + count + " times");
        // }

        // T.C. here -> O(Q*N), where Q is total Q no of elements to be searched and N is the length of the array

        // ------------------------------------------------

        // 2) USING HASHED ARRAY:
        // 5 -> size of array
        // 12 -> p value i.e. elements inside the array must not exceed p
        // 1 3 2 1 3 these are array elements
        // 5 -> No of test cases below :
        // 1 -> check how many times 1 appears
        // 4 -> check how many times 4 appears
        // 2 -> check how many times 2 appears
        // 3 -> check how many times 3 appears
        // 12 -> check how many times 12 appears

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Size of the array : " );
        // int n = sc.nextInt();

        // System.out.println("Enter p : ");
        // int p = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter the array elements which must not exceed " + p + " :" );
        // for(int i = 0; i<n; i++){
        //     int input;
        //     while(true){
        //         input = sc.nextInt();
        //         if(input <= p){
        //             break;
        //         }else{
        //             System.out.println("Enter value less than " + p);
        //         }
        //     }
        //     arr[i] = input;
        // }

        // // Pre-computation
        // // At this stage the hash array becomes ready
        // int[] hash = new int[p+1];
        // for(int i = 0; i<n; i++){
        //     hash[arr[i]]++;
        // }

        // System.out.println("Enter no of test cases : ");
        // int t = sc.nextInt();

        // while (t-- > 0) {
        //     System.out.print("Enter a number to see how many times it appear : ");
        //     int num = sc.nextInt();

        //     // fetch
        //     // In this stage just fetch the required value from the hash array
        //     System.out.println(num + " appears " + hash[num] + " times!!");
        // }


        // ------------------------------------------------

        // 3) CHARACTER HASHING :- 

        // String str = "hmgjzcatjrd!  tvxxfya";
        // // precalculate
        // int[] hashedArr = new int[256];
        // for(int i = 0; i<str.length(); i++){
        //     int ch = str.charAt(i);
        //     // int targetIndex = ch - 'a';
        //     // hashedArr[targetIndex]++;
        //     hashedArr[ch]++;
        // }
        // System.out.println("Count of space : " + hashedArr[' ']);



        // ------------------------------------------------

        // 4) FREQUENCY OF NUMBER ARRAY USING HASHMAP :-
        // int arr[] = { 2, 5, 37, 4, 2, 37, 9, 5, 2 };

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Size of the array : " );
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter the array elements :" );
        // for(int i = 0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // // Precomputation
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int item : arr){
        //     map.put(item, map.getOrDefault(item, 0) + 1);
        // }
        
        // int max = Integer.MIN_VALUE;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() > max){
        //         max = entry.getValue();
        //     }
        // }

        // Taking test cases:
        // System.out.println("Enter q : ");
        // int q = sc.nextInt();

        // while(q-- > 0){
        //     System.out.println("Enter number to test : ");
        //     int num = sc.nextInt();

        //     // fetch
        //     System.out.println("Freq of " + num + " is " + map.getOrDefault(num, 0));
        // }

        // ------------------------------------------------

        // 4) FREQUENCY OF CHARACTER ARRAY USING HASHMAP :-
        // T.c. -> O(N) where N is the length of the string. Since the loops iterates through the entire ip string.
        // S.C. -> it is also O(N) as in worst case all the characters in the string are distinct and it takes N spaces to store them in the map.
        String str = "433TUHcee3wCc";

        // pre-computation
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        // fetch
        char ch = 'C';
        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     if(entry.getKey() == ch){
        //         System.out.println("Character " + ch + " appears " + entry.getValue() + " times!!");
        //     }
        // }
        int freq = map.getOrDefault(ch, 0);
        System.out.println("Character " + ch + " appears " + freq + " times!!");
    }
}