package school.mjc.stage0.loops.task5;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String s = "8";
        for (int i = 1; i <= cathetusLength; i++) {
            String sRepeated = IntStream.range(0, i).mapToObj(a -> s).collect(Collectors.joining(""));
            System.out.println(sRepeated);
        }
    }
}
