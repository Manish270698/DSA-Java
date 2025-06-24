public class RemoveDuplicates {
    private static int removeDup(int[] nums){
        int x = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[x]){
                nums[++x] = nums[i];
            }
        }
        return x+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 3, 3, 5, 6, 6, 6, 7, 8, 9};
        System.out.println(removeDup(nums));
//        for(int num : nums){
//            System.out.print(num);
//        }
    }
}
