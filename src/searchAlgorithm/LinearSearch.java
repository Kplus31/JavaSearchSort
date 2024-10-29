package searchAlgorithm;
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target) {
                return i; // tra ve chi so neu tim thay
            }
        }
        return -1; //tra ve -1 neu khong tim thay
    }
}
