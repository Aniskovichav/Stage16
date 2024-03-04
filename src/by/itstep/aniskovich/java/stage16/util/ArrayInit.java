package by.itstep.aniskovich.java.stage16.util;

import java.util.Random;

public class ArrayInit {
    private static final Random RND;
    private static final int MAX_SIZE = 10000;
    private static final int RANGE_START_MIN = -4000;
    private static final int RANGE_END_MAX = 4000;

    static {
        RND = new Random();
    }
    public static int randomSizeArray() {
        return RND.nextInt(1, MAX_SIZE);
    }

    public static int[] initializeArray(int size) {
        return new int[size];
    }

    public static int[] randomInitElement(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(RANGE_START_MIN,
                        RANGE_END_MAX);
            }

        return array;
    }
}
