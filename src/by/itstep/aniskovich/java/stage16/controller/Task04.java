package by.itstep.aniskovich.java.stage16.controller;

import by.itstep.aniskovich.java.stage16.model.MatrixWorker;
import by.itstep.aniskovich.java.stage16.util.MatrixInit;
import by.itstep.aniskovich.java.stage16.util.MatrixUI;
import by.itstep.aniskovich.java.stage16.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage16.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage16.util.MatrixInit.randomSize;

public class Task04 {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(randomSize());

        MatrixInit.randomInitElement(matrix);


        int[][] matrix1 = {
                {1, 2, 2, 3, 3},
                {4, 4, 4, 5},
                {6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7},
                {8, 8, 8},
                {9, 9, 9, 9, 9, 9}
        };

//        ConsolePrinter.print(printMatrix(matrix));

        ConsolePrinter.print(MatrixUI.defineRowWithMaxConsecutiveCountUI
             (MatrixWorker.defineRowWithMaxConsecutiveCount(matrix1)));
    }
}
