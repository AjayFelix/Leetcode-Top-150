package ArrayAndSrings;

public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        // Initialize count to 1 as we start counting from the second element
        int count = 1;
        // Variable to keep track
        int duplicate = 1;

        // Iterate through the array starting form 2
        for (int i = 1; i < nums.length; i++) {
            // Check if 1st and 2nd no are same
            if (nums[i] == nums[i - 1]) {
                duplicate++; // Increment the duplicate count
            } else {
                duplicate = 1; // Reset duplicate count
            }

            // Check if the current element's duplicate count
            if (duplicate <= 2) {
                nums[count++] = nums[i]; // If true,
            }
        }
        // Return the length array (up to the first k elements)
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 4, 5};

        RemoveDuplicatesFromSortedArrayII remove = new RemoveDuplicatesFromSortedArrayII();

        int newLength = remove.removeDuplicates(arr);
        System.out.println("the length of the removed Duplicate array is "+newLength);

        // Printing the modified array with unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}
