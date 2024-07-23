package Numbers;

import java.util.*;

public class SumOfPrimeNumbers {
//    Problem: Given a number n, express the number as a sum of 2 prime numbers.

//    Example 1:
//    Input : N = 74
//    Output : True .
//            Explanation: 74 can be expressed as 71 + 3 and both are prime numbers.
//
//            Example 2:
//    Input : N = 11
//    Output : False.
//            Explanation: 11 cannot be expressed as sum of two prime numbers.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = false;
        int n = 0;

        /*
         //with brut force method
        for (int i = 2; i < num; i++) {
            boolean flag = isPrime(i);
            if (!flag) {
                n = num - i;
                if (!isPrime(n)) {
                    System.out.println("TRUE");
                    System.out.println("one value is = " + i + " Another value is = " + n);
                    ans = true;
                    break;
                }
            }
        }
        if (!ans) System.out.println("FALSE");
*/
        // optimise version
        if (isPrime(num) && isPrime(num - 2)) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean isPrime(int i) {
        boolean flag = false;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
