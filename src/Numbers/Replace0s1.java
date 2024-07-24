package Numbers;

public class Replace0s1 {
    /* Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.*/
    /*
    Example 1:
Input: N = 102003
Output: 112113
Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

Example 2:
Input:  204
Output: 214
Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.
     */
    public static void main(String[] args) {
        int n = 204;
        int reverse = reverse(n);
        int ans = reverse(reverse);

        System.out.println(ans);
    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int x = num % 10;
            if (x == 0) {
                reverse = reverse * 10 + 1;
            } else {
                reverse = reverse * 10 + x;
            }
            num = num / 10;
        }
        return reverse;
    }
}
