package by.itstep.aniskovich.java.stage16.model;

public class MatrixWorker {
    public static int calcBoundarySum(int[][] matrix) { // best - middle - worst: O(N+M)
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

        for (int i = 0; i < n;i++) {    // best - middle - worst: O(N^2)
            if (magicSum != sumRow(matrix, i)
                    || magicSum != sumColumn(matrix, i)
                    || magicSum != sumDiagonal(matrix)
                    || magicSum != sumSecondaryDiagonal(matrix)){
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


}
