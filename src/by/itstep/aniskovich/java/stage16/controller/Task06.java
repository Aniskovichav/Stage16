package by.itstep.aniskovich.java.stage16.controller;

import by.itstep.aniskovich.java.stage16.model.ArrayWorker;
import by.itstep.aniskovich.java.stage16.util.ArrayInit;
import by.itstep.aniskovich.java.stage16.util.ArrayUI;
import by.itstep.aniskovich.java.stage16.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage16.util.ArrayInit.initializeArray;
import static by.itstep.aniskovich.java.stage16.util.ArrayInit.randomSizeArray;

public class Task06 {
    public static void main(String[] args) {
        int[] arrayA = initializeArray(randomSizeArray());
        ArrayInit.randomInitElement(arrayA);

        long startTime = System.nanoTime();

        arrayA = ArrayWorker.bubbleSort(arrayA);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        ConsolePrinter.print(arrayA.length + " " +
                ArrayUI.checkTimeUI((int) duration) + "\n");

        int[] arrayB = initializeArray(randomSizeArray());
        ArrayInit.randomInitElement(arrayB);

        startTime = System.nanoTime();

        arrayB = ArrayWorker.bubbleSort(arrayB);

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        ConsolePrinter.print(arrayB.length + " " +
                ArrayUI.checkTimeUI((int) duration) + "\n");


        startTime = System.nanoTime();

        int[] merge = ArrayWorker.merge(arrayA, arrayB);

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        ConsolePrinter.print(merge.length + " " +
                ArrayUI.checkTimeUI((int) duration) + "\n");

        ConsolePrinter.print(ConsolePrinter.printArray(merge));
    }
}
