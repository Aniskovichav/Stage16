package by.itstep.aniskovich.java.stage16.util;

public class MatrixUI {
    public static String isMagicSquareUI(boolean flag) {
        return String.format("This matrix is%s a magic square.",
                flag ? "" : " not");
    }

    public static String sumBoundaryElementsUI(int sum) {
        return String.format("The sum of boundary elements of the matrix " +
                "is equal to %d.", sum);
    }

    public static String sumBetweenFirstAndSecondPositiveElementUI(int sum) {
        return String.format("Sum of elements located between first and " +
                "second positive element of each row of the matrix " +
                "is equal to %d.", sum);
    }

    public static String defineMonotonicColumnUI(String countColumn) {
        return String.format("Numbers of columns whose elements form" +
                " a monotonically increasing sequence: %s", countColumn);
    }

    public static String findMaxElementAscendingRowsUI(int max) {
        return max == -1
                ? "Rows of the matrix are not ordered in ascending order"
                : String.format("The maximal element of the matrix rows " +
                "ordered in ascending order is equal to %s", max);
    }

    public static String defineRowWithMaxConsecutiveCountUI(int indexRow) {
        return String.format("The longest series of identical elements " +
                "in the matrix is in the row with index %d.", indexRow);
    }


}
