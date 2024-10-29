import searchAlgorithm.BinarySearch;
import searchAlgorithm.LinearSearch;
import sortAlgorithm.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap so luong phan tu cua mang
        System.out.print("Nhap so luong phan tu cua mang: ");
        int arrayLength = sc.nextInt();

        //Khoi tao mang
        int[] arrayInput = new int[arrayLength];

        //Nhap cac phan tu cua mang tu ban phim
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i=0;i<arrayLength;i++){
            System.out.print("Phan tu thu " + i + ": ");
            arrayInput[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri can tim: ");
        int key = sc.nextInt();
        callMeForLinearSearch(arrayInput, key);
        sc.close();

        //callMeForMergeSort(arrayInput);
        //sc.close();
    }

    static void callMeForBinarySearch(int[] arrayInput, int key) {
        System.out.print(BinarySearch.binarySearch(arrayInput, key));
    }

    static void callMeForLinearSearch(int[] arrayInput, int key) 
    {
        LinearSearch linearSearchInstance = new LinearSearch();
        System.out.println("Vi tri cua phan tu can tim la:" + linearSearchInstance);
    }

    static void callMeForSelectionSort(int[] arrayInput) {
        SelectionSort selectionSortInstance = new SelectionSort();
        System.out.println("Mang truoc khi sap xep la: ");
        selectionSortInstance.selectionSort(arrayInput);
        printArray(arrayInput);
    }

    static void callMeForInsertionSort(int[] arrayInput) {
        InsertionSort insertionSortInstance = new InsertionSort();
        printArray(arrayInput);
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mang sau khi sap xep tu be den lon: ");
        printArray(arrayInput);

        //Sap xep tu lon den be
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mang sau khi sap xep tu lon den be: ");
        printArray(arrayInput);
    }
        
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}