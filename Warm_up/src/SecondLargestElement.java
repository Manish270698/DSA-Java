public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,1,94, 95, 56, 45, 57, 95};

        System.out.println(second_largest(arr));
    }

    public static int second_largest(int[] arr){
        if(arr.length < 2){
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
