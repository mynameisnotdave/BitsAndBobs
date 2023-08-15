import java.util.Arrays;

public class ModifyArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        // with k=3 you want the result looking like this:
        // 8,9,10,1,2,3,4,5,6,7
        int[] transNums = new int[nums.length];
        System.arraycopy(nums, nums.length-k, transNums, 0,k);
        System.arraycopy(nums, 0, transNums, k, nums.length - k);
        System.out.println(Arrays.toString(transNums));
    }

}
