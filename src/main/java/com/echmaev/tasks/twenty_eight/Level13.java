package com.echmaev.tasks.twenty_eight;

import java.util.Arrays;

public class Level1 {
    public static int [] UFO(int n, int [] data, boolean octal) {
        int[] newArray = new int[n];
        int pow;
        if(octal) {
            pow = 8;
        } else {
            pow = 16;
        }
            for(int count = 0; count < data.length; count++) {
                int sum = 0;
                char[] chars = String.valueOf(data[count]).toCharArray();
                int counter = chars.length - 1;
                for (char charik : chars) {
                    sum += Character.getNumericValue(charik) * (Math.pow(pow, counter));
                    counter--;
                }
                newArray[count] = sum;
                sum = 0;
            }
        return newArray;
    }
}
