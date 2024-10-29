package sortAlgorithm;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i =1;i<n;i++){
            int temp =arr[i];
            int j = i-1;

            //di chuyen cac phan tu cua arr[0..i-1] lon hon key ve phia sau
            //cho den khi tim duoc vi tri dung cho key
            while(j>=0 && arr[j] < temp) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = temp;
        }
    }
}
