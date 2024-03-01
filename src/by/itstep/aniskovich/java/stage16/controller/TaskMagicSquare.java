package by.itstep.aniskovich.java.stage16.controller;

import by.itstep.aniskovich.java.stage16.model.MatrixWorker;
import by.itstep.aniskovich.java.stage16.util.MatrixInit;
import by.itstep.aniskovich.java.stage16.util.MatrixUI;
import by.itstep.aniskovich.java.stage16.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage16.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage16.util.MatrixInit.randomSize;
import static by.itstep.aniskovich.java.stage16.view.ConsolePrinter.printMatrix;

public class TaskMagicSquare {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(randomSize());

        MatrixInit.randomInitElement(matrix);

        ConsolePrinter.print(printMatrix(matrix));


        ConsolePrinter.print(MatrixUI.isMagicSquareUI
                (MatrixWorker.isMagicMatrix(matrix)) + "\n");

        int[][] matrix1 = {
                {2, 9, 4},
                {7, 5, 3},
                {6, 1, 8},
        };
        ConsolePrinter.print(printMatrix(matrix1));

        ConsolePrinter.print(MatrixUI.isMagicSquareUI
                (MatrixWorker.isMagicMatrix(matrix1)));

    }
}