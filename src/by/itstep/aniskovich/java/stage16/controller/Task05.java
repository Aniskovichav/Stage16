package by.itstep.aniskovich.java.stage16.controller;

import by.itstep.aniskovich.java.stage16.model.MatrixWorker;
import by.itstep.aniskovich.java.stage16.util.MatrixInit;
import by.itstep.aniskovich.java.stage16.util.MatrixUI;
import by.itstep.aniskovich.java.stage16.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage16.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage16.util.MatrixInit.randomSize;

public class Task05 {
    public static void main(String[] args) {
//        int[][] matrix = initializeMatrix(randomSize());
//
//        MatrixInit.randomInitElement(matrix);


        int[][] matrix1 = {
                {1, 2, 3, 6, 7, 8, 9},
                {4, 4, 4, 5},
                {0, 1, 2, 3, 4, 7, 8, 9},
                {8, 8, 8},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        };

//        ConsolePrinter.print(printMatrix(matrix));

        ConsolePrinter.print(MatrixUI.defineRowWithMaxAscendingCountUI
            ((MatrixWorker.defineRowWithMaxAscendingCount(matrix1))));
    }
}
