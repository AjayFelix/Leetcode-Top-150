package ArrayAndSrings;
//LEETCODE PROBLEM NO :189
public class RotateArray {
    public void rotate(int [] nums, int k){
        int n = nums.length;
        k = k % n; // In case k is greater than the length of the array

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);

    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
}

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int k = 3;

        RotateArray rotate = new RotateArray();

        rotate.rotate(arr,k);

        for(int x: arr){
            System.out.print(x);
        }

    }
}
