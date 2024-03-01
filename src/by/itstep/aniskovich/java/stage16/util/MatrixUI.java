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
}
