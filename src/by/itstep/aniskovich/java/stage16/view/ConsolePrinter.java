package by.itstep.aniskovich.java.stage16.view;

public class ConsolePrinter {
    public static void print(String msg) {
        System.out.print(msg);
    }

    public static String printMatrix(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                builder.append(matrix[i][j]).append("\t");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static String printArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
                builder.append(array[i]).append("\t");
        }
        return builder.toString();
    }
}
