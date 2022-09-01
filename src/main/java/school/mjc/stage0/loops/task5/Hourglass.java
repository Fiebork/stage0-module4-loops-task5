package school.mjc.stage0.loops.task5;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int n = height / 2;
        boolean isDone = false;
        if (height % 2 == 0) {
            for (int i = 1; i <= height; i++) {
                StringBuilder s = new StringBuilder();
                for (int j = 0; j < height / 2; j++) {
                    if (j < n) {
                        s.append("8");
                    } else {
                        s.append(" ");
                    }
                }
                if (n == 1 && !isDone) {
                    isDone = true;
                    n--;
                }
                if (!isDone) {
                    n--;
                } else {
                    n++;
                }

                s.reverse();
                System.out.println(s.toString() + s.reverse().toString());
            }
        } else {
            for (int i = 1; i <= height; i++) {
                StringBuilder s = new StringBuilder();
                for (int j = 0; j < height / 2; j++) {
                    if (j < n) {
                        s.append("8");
                    } else {
                        s.append(" ");
                    }
                }
                if (n == 0 && !isDone) {
                    isDone = true;
                }
                if (!isDone) {
                    n--;
                } else {
                    n++;
                }
                s.reverse();
                System.out.println(s.toString() + "8" + s.reverse().toString());
            }
        }
    }
}
