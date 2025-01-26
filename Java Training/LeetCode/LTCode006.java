import java.util.Arrays;

class Solution6 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; 
        }
        int i = 0; 
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { 
                i++;
                nums[i] = nums[j]; 
            }
        }
        if((nums[nums.length-1]==nums[nums.length-2])){
            nums[nums.length-1]=0;
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}

public class LTCode006 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();

        int[] arr = {1,1,2,3,4};
        int result = s.removeDuplicates(arr);
        System.out.println(result);
    }
}