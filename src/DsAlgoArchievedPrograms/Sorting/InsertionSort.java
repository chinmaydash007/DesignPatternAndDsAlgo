package DsAlgoArchievedPrograms.Sorting;

public class InsertionSort {
    public int[] sort(int arr[]) {
        int temp;
        int j;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
