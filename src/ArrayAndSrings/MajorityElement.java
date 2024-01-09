package ArrayAndSrings;

import java.util.Arrays;

public class MajorityElement {

    public int solution(int[] nums) {
        // Initialize count to 1 and temp to the first element of the array
        int count = 1;
        int temp = nums[0];

        // Iterate through the array starting form (index 1)
        for (int i = 1; i < nums.length; i++) {
            // If count is 0, update temp to the current element and reset count to 1
            if (count == 0) {
                temp = nums[i];
                count++;
            }
            // If the current element is equal to temp, increment count
            else if (temp == nums[i]) {
                count++;
            }
            // If the current element is different from temp, decrement count
            else {
                count--;
            }}
        // The final value of temp is the majority element
        return temp;
    }
    public static void main(String[] args) {
        int arr [] ={1,1,1,2,3,4,5};

        MajorityElement element = new MajorityElement();

       int ans= element.solution(arr);

       for(int a: arr){
           System.out.print(a);
       }

       System.out.println(ans);
    }
}
