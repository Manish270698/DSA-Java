public class CountDigits {
    private static int counter(int n){
        if(n == 0) return 1;

        n = Math.abs(n);
        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = -0;
        System.out.println(counter(n));
    }
}
