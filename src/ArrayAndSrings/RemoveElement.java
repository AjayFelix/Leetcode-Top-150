package ArrayAndSrings;

public class RemoveElement {
    public int remove(int[] nums, int val) {
        // Initialize a variable to keep track of the valid elements
        int count = 0;

        // Iterate through the elements of the array
        for (int i = 0; i < nums.length; i++)
        {
            // Check if the current element is not equal to the Exact value
            if (nums[i] != val) {
                // If not equal, update the array at position 'count' with the current element
                nums[count] = nums[i];

                // Increment 'count' to move to the next position
                count++;
            }
        }
        // 'count' now represents the new length of the array
        return count;
    }


    public static void main(String[] args) {

        int [] array = {1,2,2,3,4,5,2};

        int a = 2;

        RemoveElement element = new RemoveElement();

        int remove = element.remove(array, a);
        System.out.println(remove);


    }


}
