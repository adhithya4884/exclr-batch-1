public class LTCode009 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) { // Ensure nums1 is the smaller array
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tempSize = m;
            m = n;
            n = tempSize;
        }

        int left = 0, right = m, halfLength = (m + n + 1) / 2;
        while (left < right) {
            int i = left + (right - left) / 2;
            int j = halfLength - i;
            if (nums1[i] < nums2[j - 1]) {
                left = i + 1; // i is too small
            } else {
                right = i; // i is too big
            }
        }

        int i = left;
        int j = halfLength - left;

        int maxLeft = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
        int minRight = (i == m) ? Integer.MAX_VALUE : nums1[i];

        if ((m + n) % 2 == 0) {
            return (Math.max(maxLeft, nums2[j - 1]) + Math.min(minRight, nums2[j])) / 2.0;
        } else {
            return Math.max(maxLeft, nums2[j - 1]);
        }
    }
}
