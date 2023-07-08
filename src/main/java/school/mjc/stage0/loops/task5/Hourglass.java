package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int height = 8;
        if(height % 2 == 0) {
            int sideCenter = -1;
            sideCenter = height / 2 - 1;
            System.out.println(sideCenter);

            for(int i = 0; i < height; i++) {
                if(i == 0 || i == height - 1) {
                    for(int j = 0; j < height; j++) {
                        System.out.print(8);
                    }
                } else {
                    if(i > 0 && i < sideCenter) {
                        for(int j = 0; j <= height - 1; j++) {
                            if(j < i) {
                                System.out.print("t");
                            } else if(j > sideCenter + 1 && j > height - i - 1) {
                                System.out.print("t");
                            } else {
                                System.out.print(8);
                            }
                        }
                    } else if(i == sideCenter || i == sideCenter + 1) {
                        for(int j = 0; j < sideCenter; j++) {
                            System.out.print("t");
                        }
                        System.out.print(88);
                        for(int j = sideCenter + 2; j < height; j++) {
                            System.out.print("t");
                        }

                    } else if(i > 0 && i > sideCenter) {
                        for(int j = 0; j <= height - 1; j++) {
                            if(j < i) {
                                System.out.print("t");
                            } else if(j > sideCenter + 1 && j > height - i - 1) {
                                System.out.print("t");
                            } else {
                                System.out.print(8);
                            }
                        }
                    }
                }
                System.out.print("\n");
            }

        } else {

        }
    }
}
