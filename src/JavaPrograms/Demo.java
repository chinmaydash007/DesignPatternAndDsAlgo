package JavaPrograms;

import DsAlgoArchievedPrograms.BubbleSort;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        printArray(arr);
        arr = bubbleSort.sort(arr);
        printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
