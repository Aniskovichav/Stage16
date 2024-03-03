package by.itstep.aniskovich.java.stage16.controller;

import by.itstep.aniskovich.java.stage16.model.MatrixWorker;
import by.itstep.aniskovich.java.stage16.util.MatrixInit;
import by.itstep.aniskovich.java.stage16.util.MatrixUI;
import by.itstep.aniskovich.java.stage16.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage16.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage16.util.MatrixInit.randomSize;
import static by.itstep.aniskovich.java.stage16.view.ConsolePrinter.printMatrix;

public class Task02 {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(randomSize());

        MatrixInit.randomInitElement(matrix);


//        int[][] matrix1 = {
//                {2, 9, 4, 5},
//                {3, 5, -3, 2},
//                {6, 0, -6, 8},
//        };

        ConsolePrinter.print(printMatrix(matrix));

        ConsolePrinter.print(MatrixUI.defineMonotonicColumnUI
                (MatrixWorker.defineMonotonicColumns(matrix)));
    }
}

