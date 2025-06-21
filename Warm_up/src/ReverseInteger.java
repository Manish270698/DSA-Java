// Leetcode Problem - 7
public class ReverseInteger {
    private static int reverse(int n){
        int nCopy = n;
        n = Math.abs(n);
        long rev = 0;
        while(n>0){
            rev = (10*rev) + n%10;
            n = n/10;
        }

        if(nCopy < 0){
            return -rev < Integer.MIN_VALUE ? 0 : (int)-rev;
        }
        else{
            return rev > Integer.MAX_VALUE ? 0 : (int)rev;
        }
    }

    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println(reverse(n));
    }
}
