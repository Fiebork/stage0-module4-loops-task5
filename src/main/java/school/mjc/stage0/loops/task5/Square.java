package school.mjc.stage0.loops.task5;

import static java.lang.Math.*;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0) {
                    System.out.print(8);
                } else if (i == sideLength - 1) {
                    System.out.print(8);
                } else if (j == 0) {
                    System.out.print(8);
                } else if (j == sideLength - 1) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
