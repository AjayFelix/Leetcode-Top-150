package ArrayAndSrings;
//LEETCODE PROBLEM NO :55
public class JumpGame {
    public static boolean canJump(int[] nums) {

        int maxReach = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                // If the current index is unreachable, return false
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= n - 1) {
                // If we can reach or go beyond the last index, return true
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println("Can reach the last index for nums1? " + canJump(nums1)); // Output: true
        System.out.println("Can reach the last index for nums2? " + canJump(nums2)); // Output: false
    }

}
