
import java.util.Arrays;

class Solution5 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
public class LTCode005 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        int[] arr = {4,2,4,2,1};
        int target = 8;
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Target: "+target);

        int[] result = s.twoSum(arr, target);

        System.out.println("Indices of target result are: ");
        System.out.println(result[0] + " " + result[1]);
    }
}
