package DsAlgoArchievedPrograms.Sorting;

public class MergeSort {
    int tempMergeArray[];
    int arr[];

    public int[] sort(int arr[]) {
        this.tempMergeArray = new int[arr.length];
        this.arr = arr;


        divideArray(0, arr.length - 1);
        return this.arr;
    }

    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int mid = (lowerIndex + higherIndex) / 2;
            divideArray(lowerIndex, mid);
            divideArray(mid + 1, higherIndex);
            mergeSort(lowerIndex, mid, higherIndex);
        }
    }

    public void mergeSort(int lowerIndex, int middleIndex, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArray[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middleIndex + 1;
        int k = lowerIndex;
        while (i <= middleIndex && j <= higherIndex) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                arr[k] = tempMergeArray[i];
                i++;
            } else {
                arr[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= middleIndex) {
            arr[k] = tempMergeArray[i];
            i++;
            k++;

        }
    }
}
