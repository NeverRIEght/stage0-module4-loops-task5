package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        //if the figure has two filled cols in center
        if(height % 2 == 0) {

            //sideCenter = first index of this filled cols (for both height and width)
            //sideCenter + 1 = second index

            int sideCenter = -1;
            sideCenter = height / 2 - 1;

            for(int i = 0; i < height; i++) {
                if(i == 0 || i == height - 1) {

                    //fill first and last rows

                    for(int j = 0; j < height; j++) {
                        System.out.print(8);
                    }

                } else {

                    //Part 1: rows before the sideCenter

                    if(i > 0 && i < sideCenter) {
                        for(int j = 0; j <= height - 1; j++) {

                            //rules to fill blank space
                            //for first part of a row

                            if(j < i) {
                                System.out.print(" ");

                                //for last part of a row

                            } else if(j > sideCenter + 1 && j > height - i - 1) {
                                System.out.print(" ");

                                //if rules do not apply - fill this part with 8

                            } else {
                                System.out.print(8);
                            }
                        }

                        //Part 2: sideCenter and sideCenter + 1 rows

                    } else if(i == sideCenter || i == sideCenter + 1) {

                        //Print blank before the sideCenter

                        for(int j = 0; j < sideCenter; j++) {
                            System.out.print(" ");
                        }

                        //Print filled in sideCenter

                        System.out.print(88);

                        //Print blank after the sideCenter

                        for(int j = sideCenter + 2; j < height; j++) {
                            System.out.print(" ");
                        }

                        //Part 3: rows after sideCenter + 1 (part 1 code with small changes)

                    } else if(i > 0 && i > sideCenter + 1) {
                        for(int j = 0; j <= height - 1; j++) {
                            if(j < sideCenter - (i - (sideCenter + 1))) {
                                System.out.print(" ");
                            } else if(j > sideCenter + 1 + (i - (sideCenter + 1))) {
                                System.out.print(" ");
                            } else {
                                System.out.print(8);
                            }
                        }
                    }
                }
                System.out.print("\n");
            }

            //if has one filled col in center

        } else if(height % 2 == 1){

            //Now sideCenter + 1 is unusable

            int sideCenter = -1;
            sideCenter = height / 2;

            for(int i = 0; i < height; i++) {
                if(i == 0 || i == height - 1) {

                    //fill first and last rows

                    for(int j = 0; j < height; j++) {
                        System.out.print(8);
                    }
                } else {

                    //Part 1: rows before the sideCenter

                    if(i > 0 && i < sideCenter) {
                        for(int j = 0; j <= height - 1; j++) {

                            //rules to fill blank space
                            //for first part of a row

                            if(j < i) {
                                System.out.print(" ");

                                //for last part of a row

                            } else if(j > sideCenter + 1 && j > height - i - 1) {
                                System.out.print(" ");

                                //if rules do not apply - fill this part with 8

                            } else {
                                System.out.print(8);
                            }
                        }

                        //Part 2: sideCenter row

                    } else if(i == sideCenter) {

                        //Print blank before the sideCenter

                        for(int j = 0; j < sideCenter; j++) {
                            System.out.print(" ");
                        }

                        //Print filled in sideCenter

                        System.out.print(8);

                        //Print blank after the sideCenter

                        for(int j = sideCenter + 1; j < height; j++) {
                            System.out.print(" ");
                        }

                        //Part 3: rows after sideCenter

                    } else if(i > 0 && i > sideCenter) {
                        for(int j = 0; j <= height - 1; j++) {
                            if(j < sideCenter - (i - sideCenter)) {
                                System.out.print(" ");
                            } else if(j > sideCenter + 1 + (i - (sideCenter + 1))) {
                                System.out.print(" ");
                            } else {
                                System.out.print(8);
                            }
                        }
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
