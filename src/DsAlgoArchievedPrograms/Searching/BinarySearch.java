package DsAlgoArchievedPrograms.Searching;

public class BinarySearch {
    public int search(int arr[], int val, int start, int end) {
        if (arr.length < 1 || start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == val) {
            return mid;
        }
        if (val < arr[mid]) {
            return search(arr, val, start, mid - 1);
        } else {
            return search(arr, val, mid + 1, end);
        }

    }
}
