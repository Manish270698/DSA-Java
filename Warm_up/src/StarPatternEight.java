/*
1
10
101
1010
10101
 */
public class StarPatternEight {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i<n; i++){
            for(int j = 0; j < i+1; j++){
                if(j%2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
