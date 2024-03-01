package by.itstep.aniskovich.java.stage16.util;

import java.util.Random;

public class MatrixInit {
    private static final Random RND;
    private static final int SIZE = 10;
    private static final int RANGE_START = 0;
    private static final int RANGE_END = 10;

    static {
        RND = new Random();
    }

    public static int[][] initializeMatrix(int size) {
        return new int[size][size];
    }

    public static int[][] randomInitElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = RND.nextInt(RANGE_START,RANGE_END);
            }
        }
        return matrix;
    }
    public static int randomSize() {
        return RND.nextInt(1, SIZE);
    }

}
