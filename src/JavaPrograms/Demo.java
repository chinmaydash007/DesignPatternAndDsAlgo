package JavaPrograms;


import KoltinPrograms.Person;


import java.util.function.Consumer;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Demo {
    static int arr[] = {10, 2, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    static int tempMergerArray[] = new int[arr.length];


    static class Arithmetrics {

    }

    interface Perform {
        void action(int a, int b);
    }


    public static void main(String[] args) throws IOException {
        System.out.format("%,d %s", 2334343, "CHinmay");
    }


    static int factrial(int n) {
        if (n < 1) {
            return 1;
        }
        System.out.println(n);
        return n * factrial(n - 1);
    }

    static void quickSortRecurcios(int arr[], int low, int high) {
        int pi = partisioning(arr, low, high);
        if (low < pi - 1) {
            quickSortRecurcios(arr, low, pi - 1);
        }
        if (pi < high) {
            quickSortRecurcios(arr, pi, high);
        }
    }

    static int partisioning(int arr[], int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }


}


