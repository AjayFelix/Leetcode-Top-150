package ArrayAndSrings;

public class RemoveDuplicatesFromSortedArray {

   public int removeDuplicates(int []arr){
       // Initialize a pointer 'j' to 1
       int j = 1;
       // Iterate through the array starting from index 1
       for (int i=1; i<arr.length;i++){
           // If different, update the array at index 'j' with the current element
           // Increment 'j' to move to the next position where a unique element should go
           if(arr[i]!=arr[i-1]){
               arr[j++]=arr[i];
           }
     }//'j' now is the new length of the array without duplicates
       return j;
   }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 2, 2, 3, 4, 5};

        RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();

        int newLength = remove.removeDuplicates(arr);
        System.out.println("the length of the removed Duplicate array is "+newLength);

        // Printing the modified array with unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
     }

}
