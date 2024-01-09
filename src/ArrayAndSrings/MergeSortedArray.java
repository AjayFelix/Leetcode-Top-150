package ArrayAndSrings;
//LEETCODE PROBLEM NO :88
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Three pointer technique

        // Initialize pointers for nums1 and nums2
        int r1 = m - 1;  // Pointer for nums1 (starting from the end)
        int r2 = n - 1;  // Pointer for nums2 (starting from the end)

        // Iterate through the merged array from the end to the beginning
        for (int w = m + n - 1; w >= 0; w--) {
            // If both pointers are still within the valid range
            if (r1 >= 0 && r2 >= 0) {
                // Compare elements at the current positions of r1 and r2
                // Place the larger element at the current position in nums1
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            }
            // If elements in nums2 have been merged and there are still elements in nums1
            else if (r1 >= 0) {
                // Copy the remaining elements from nums1 to the merged array
                nums1[w] = nums1[r1--];
            }
            // If elements in nums1 have been merged and there are still elements in nums2
            else {
                // Copy the remaining elements from nums2 to the merged array
                nums1[w] = nums2[r2--];
            }
        }
    }


    public static void main(String[] args) {

        MergeSortedArray merger = new MergeSortedArray();

        // Example test
        int[] nums1 = {1,3,5,0,0,0};

        int[] nums2 = {2, 4, 6};

        merger.merge(nums1, 3, nums2, 3);


        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
}
