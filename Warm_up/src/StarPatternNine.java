/*
1
01
010
1010
10101
*/
public class StarPatternNine {
    public static void main(String[] args) {
        int n = 5;

        int toggle = 1;
        for(int i = 0; i< n; i++){
            for(int j = 0 ; j<i+1; j++){
                System.out.print(toggle);
                if(toggle == 1){
                    toggle = 0;
                }
                else{
                    toggle = 1;
                }
            }
            System.out.println();
        }
    }
}
