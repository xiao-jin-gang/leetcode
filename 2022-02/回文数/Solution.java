// 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
// 例如，121 是回文，而 123 不是。
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(123321);
        System.out.println(palindrome);
    }
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int i=0;
        int m = x;
        while (x > 0){
            // 123
            i = i * 10 + (x % 10); // 3
            x = x / 10; // 12
        }
        if (i == m){
            return true;
        }
        return false;
    }
}