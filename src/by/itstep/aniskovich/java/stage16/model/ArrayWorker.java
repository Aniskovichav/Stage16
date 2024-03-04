package by.itstep.aniskovich.java.stage16.model;

public class ArrayWorker {
    public static int[] merge(int[] a, int[] b) {
        if (a == null || b == null) {
            return new int[0];
        }

        int[] mergeArray = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                mergeArray[k++] = a[i++];
            } else {
                mergeArray[k++] = b[j++];
            }
        }

        while (i < a.length) {
            mergeArray[k++] = a[i++];
        }

        while (j < b.length) {
            mergeArray[k++] = b[j++];
        }

        return mergeArray;
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
