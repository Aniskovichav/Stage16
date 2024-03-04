package by.itstep.aniskovich.java.stage16.util;

public class ArrayUI {
    public static String checkTimeUI(int time) {
        return String.format("Algorithm execution time: %d nanoseconds " +
                "or %d milliseconds.", time, time / 1000000);
    }
}
