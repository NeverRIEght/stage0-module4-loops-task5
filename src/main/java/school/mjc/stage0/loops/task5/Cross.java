package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int sideCenter = -1;
        if(sideLength % 2 == 1) {
            sideCenter = sideLength / 2;
            for(int i = 0; i < sideLength; i++) {
                if(i == sideCenter) {
                    for(int j = 0; j < sideLength; j++) {
                        System.out.print(8);
                    }
                } else {
                    for(int j = 0; j < sideLength; j++) {
                        if(j == sideCenter) {
                            System.out.print(8);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
