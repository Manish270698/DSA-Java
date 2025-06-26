// Leetcode Problem - 27
public class RemoveElement {
    private static int removeElement(int[] arr, int val){
        int x = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != val){
                arr[x++] = arr[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
