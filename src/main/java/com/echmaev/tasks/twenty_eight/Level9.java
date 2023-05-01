package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static String TheRabbitsFoot(String s, boolean encode) {
        String withoutGaps = s.replaceAll("\\s", "");
        char[] charString = withoutGaps.toCharArray();
        int countOfCharArray = 0;
        char[][] array;
        StringBuilder stringBuilder = new StringBuilder(s.length());
        int length = withoutGaps.length();
        double sqrt = Math.sqrt(length);
        int downDigit = (int) sqrt;
        int upDigit = downDigit + 1;
        int sizeOfMatrix = downDigit * upDigit;
        if(encode) {

            if (length > sizeOfMatrix) {
                downDigit = downDigit + 1;
            }

            array = new char[downDigit][upDigit];
            outerLoop:
            for (int i = 0; i < downDigit; i++) {
                for (int j = 0; j < upDigit; j++) {
                    if(countOfCharArray == length) {
                        break outerLoop;
                    }
                    array[i][j] = charString[countOfCharArray];
                    countOfCharArray++;

                }
            }

            for (int i = 0; i < upDigit; i++) {
                for (int j = 0; j < downDigit; j++) {
                    if (array[j][i] != 0) {
                        stringBuilder.append(array[j][i]);
                    }
                }
                stringBuilder.append(" ");
            }
        } else {
            if (length > sizeOfMatrix) {
                downDigit = downDigit + 1;
            }
            String[] strArray = s.split(" ");
            int counter = 0;
            int arrIndex = 0;
            int charIndex = 0;
            while (counter < length) {
                if(charIndex < strArray[arrIndex].length()) {
                    stringBuilder.append(strArray[arrIndex].charAt(charIndex));
                    counter++;
                    arrIndex++;

                    if (arrIndex >= strArray.length) {
                        arrIndex = 0;
                        charIndex++;
                    }
                }
            }
            return stringBuilder.toString();
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
