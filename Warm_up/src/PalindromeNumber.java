// Leetcode Problem - 9
public class PalindromeNumber {
    private static boolean isPalindrome(int n){
        if(n<0) return false;
        int nCopy = n;
        int rev = 0;
        while(n > 0){
            rev = (10*rev) + n%10;
            n = n/10;
        }

        return rev == nCopy;
    }

    public static void main(String[] args) {
        int n = 12421;
        System.out.println(isPalindrome(n));
    }
}
