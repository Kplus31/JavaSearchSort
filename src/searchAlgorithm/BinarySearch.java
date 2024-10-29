package searchAlgorithm;
public class BinarySearch {
    //Interative binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            //Check if target is present at mid
            if(arr[mid] < target)
            left = mid +1;

            //if target is smaller , ignore right half
            else 
                right = mid -1;
        }
        //target not found
        return -1;
    } 
}