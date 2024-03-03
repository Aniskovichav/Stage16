package by.itstep.aniskovich.java.stage16.model;

public class MatrixWorker {
    public static int calcBoundarySum(int[][] matrix) { // best - middle - worst: O(N+M)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }
        int sum = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int j = 0; j < columns; j++) {
            sum += matrix[0][j];
            sum += matrix[rows - 1][j];
        }

        for (int i = 1; i < rows - 1; i++) {
            sum += matrix[i][0];
            sum += matrix[i][columns - 1];
        }

        return sum;
    }

    public static boolean isMagicMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        int magicSum = n * (n * n + 1) / 2;

        for (int i = 0; i < n; i++) {    // best - middle - worst: O(N^2)
            if (magicSum != sumRow(matrix, i)
                    || magicSum != sumColumn(matrix, i)
                    || magicSum != sumDiagonal(matrix)
                    || magicSum != sumSecondaryDiagonal(matrix)) {
                return false;
            }
        }
        return true;
    }

    private static int sumRow(int[][] matrix, int i) {
        int sum = 0;
        int n = matrix.length;

        for (int j = 0; j < n; j++) { // best - middle - worst: O(N)
            sum += matrix[i][j];
        }
        return sum;
    }

    private static int sumColumn(int[][] matrix, int j) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) { // best - middle - worst: O(N)
            sum += matrix[i][j];
        }
        return sum;
    }

    private static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) { // best - middle - worst: O(N)
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) { // best - middle - worst: O(N)
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }

    public static int sumBetweenFirstAndSecondPositiveElement(int[][] matrix) {   // best - middle - worst: O(N*(M+K))
        if (matrix == null || matrix.length == 0) { // O(1)
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) { // O(N)
            int firstIndex = -1;
            int secondIndex = -1;

            for (int j = 0; j < matrix[i].length; j++) { // O(M)
                if (matrix[i][j] > 0 && firstIndex == -1) {
                    firstIndex = j;
                } else if (matrix[i][j] > 0 && secondIndex == -1) {
                    secondIndex = j;
                    break;
                }
            }
            sum += sumRowBetweenFirstAndSecondDesiredEl(matrix, i, firstIndex,
                    secondIndex);
        }

        return sum;
    }

    private static int sumRowBetweenFirstAndSecondDesiredEl(int[][] matrix,
                                                            int i, int first, int second) { //Best O(1) Middle O(K) Worst O(N)
        if (first == -1 || second == -1) {
            return 0;
        }

        int sum = 0;

        for (int j = first + 1; j < second; j++) {
            sum += matrix[i][j];
        }
        return sum;
    }

    public static String defineMonotonicColumns(int[][] matrix) { //best - middle - worst: O(N*M)
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < matrix[0].length; j++) {
            boolean increasing = true;

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < matrix[i - 1][j]) {
                    increasing = false;
                    break;
                }
            }

            builder = increasing ? builder.append(j).append(" ") : builder;
        }

        return builder.toString();
    }

    public static int findMaxElementAscendingRows(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int maxElement = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            if (isAscending(row)) {
                for (int element : row) {
                    maxElement = element > maxElement ? element : maxElement;
                }
            }
        }

        return maxElement == Integer.MIN_VALUE
                ? -1
                : maxElement;
    }

    private static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int defineRowWithMaxConsecutiveCount(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int maxRow = -1;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int currentCount = 1;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == matrix[i][j - 1]) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxRow = i;
                    }
                } else {
                    currentCount = 1;
                }
            }
        }

        return maxRow;
    }
}
