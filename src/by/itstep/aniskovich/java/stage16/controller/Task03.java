package by.itstep.aniskovich.java.stage16.controller;

import by.itstep.aniskovich.java.stage16.model.MatrixWorker;
import by.itstep.aniskovich.java.stage16.util.MatrixInit;
import by.itstep.aniskovich.java.stage16.util.MatrixUI;
import by.itstep.aniskovich.java.stage16.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage16.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage16.util.MatrixInit.randomSize;
import static by.itstep.aniskovich.java.stage16.view.ConsolePrinter.printMatrix;

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(randomSize());

        MatrixInit.randomInitElement(matrix);


        int[][] matrix1 = {
                {2, 3, 4, 5},
                {3, 5, -3, 2},
                {6, 7, 8, 9},
        };

//        ConsolePrinter.print(printMatrix(matrix));

        ConsolePrinter.print(MatrixUI.findMaxElementAscendingRowsUI
                (MatrixWorker.findMaxElementAscendingRows(matrix1)));
    }
}

