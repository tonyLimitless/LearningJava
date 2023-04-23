package com.echmaev.tasks.twenty_eight;

public class Level6 {

    public static String PatternUnlock(int n, int [] hits) {
        int index = 0;
        double sum = 0;

        while(index < n - 1) {
            if(hits[index] == 1) {
                switch (hits[index + 1]) {
                    case 2:
                        sum += 1;
                        break;
                    case 5:
                        sum += Math.sqrt(2);
                        break;
                    case 6:
                        sum += 1;
                        break;
                    case 8:
                        sum += Math.sqrt(2);
                        break;
                    case 9:
                        sum += 1;
                        break;
                }

            } else if (hits[index] == 2) {
                switch (hits[index + 1]) {
                    case 1:
                        sum += 1;
                        break;
                    case 3:
                        sum += 1;
                        break;
                    case 4:
                        sum += Math.sqrt(2);
                        break;
                    case 5:
                        sum += 1;
                        break;
                    case 6:
                        sum += Math.sqrt(2);
                        break;
                    case 7:
                        sum += Math.sqrt(2);
                        break;
                    case 8:
                        sum += 1;
                        break;
                    case 9:
                        sum += Math.sqrt(2);
                        break;
                }

            } else if (hits[index] == 3) {
                switch (hits[index + 1]) {
                    case 2:
                        sum += 1;
                        break;
                    case 4:
                        sum += 1;
                        break;
                    case 5:
                        sum += Math.sqrt(2);
                        break;
                    case 7:
                        sum += 1;
                        break;
                    case 8:
                        sum += Math.sqrt(2);
                        break;
                }
            } else if (hits[index] == 4) {
                switch (hits[index + 1]) {
                    case 2:
                        sum += Math.sqrt(2);
                        break;
                    case 3:
                        sum += 1;
                        break;
                    case 5:
                        sum += 1;
                        break;
                }

            } else if (hits[index] == 5) {
                switch (hits[index + 1]) {
                    case 1:
                        sum += Math.sqrt(2);
                        break;
                    case 2:
                        sum += 1;
                        break;
                    case 3:
                        sum += Math.sqrt(2);
                        break;
                    case 4:
                        sum += 1;
                        break;
                    case 6:
                        sum += 1;
                        break;
                }

            } else if (hits[index] == 6) {
                switch (hits[index + 1]) {
                    case 1:
                        sum += 1;
                        break;
                    case 2:
                        sum += Math.sqrt(2);
                        break;
                    case 5:
                        sum += 1;
                        break;
                }

            } else if (hits[index] == 7) {
                switch (hits[index + 1]) {
                    case 2:
                        sum += Math.sqrt(2);
                        break;
                    case 3:
                        sum += 1;
                        break;
                    case 8:
                        sum += 1;
                        break;
                }
            } else if (hits[index] == 8) {
                switch (hits[index + 1]) {
                    case 1:
                        sum += Math.sqrt(2);
                        break;
                    case 2:
                        sum += 1;
                        break;
                    case 3:
                        sum += Math.sqrt(2);
                        break;
                    case 7:
                        sum += 1;
                        break;
                    case 9:
                        sum += 1;
                        break;
                }

            } else if (hits[index] == 9) {
                switch (hits[index + 1]) {
                    case 1:
                        sum += 1;
                        break;
                    case 2:
                        sum += Math.sqrt(2);
                        break;
                    case 8:
                        sum += 1;
                        break;
                }
            }

            index++;
        }

        if(String.valueOf(sum).matches("^-?[0-9]*\\.?[0]{1}$"))  {
            return String.valueOf((int)(sum * 100000)).replaceAll("0", "");
        }

        String str = String.valueOf(sum);

        char ch = str.charAt(str.indexOf('.') + 6);
        if (ch > '4') {
            return String.valueOf((int) (sum * 100000) + 1).replaceAll("0", "");
        } else {
            return String.valueOf((int) (sum * 100000)).replaceAll("0", "");

        }
    }
}
