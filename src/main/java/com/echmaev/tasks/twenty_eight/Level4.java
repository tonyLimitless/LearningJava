package com.echmaev.tasks.twenty_eight;

import java.util.Arrays;

public class Level1 {
    public static int [] MadMax(int n, int [] tele) {
        if (tele.length == 1) {
            return tele;
        }
        sortOfChoice(tele);
        reverseArray(tele);
        return tele;
    }

    private static int [] reverseArray(int[] tele) {
        int mid = (tele.length - 1) / 2;
        int max = tele[tele.length - 1];
        int indexOfTele = tele.length - 1;
        int[] rightPartOfArray = Arrays.copyOfRange(tele, mid, tele.length - 1);
        for (int index = 0; index < rightPartOfArray.length; index++) {
            tele[indexOfTele] = rightPartOfArray[index];
            indexOfTele--;
        }
        tele[mid] = max;
        return tele;
    }

    public static int[] sortOfChoice(int[] tele) {
        for (int i = 0; i < tele.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tele.length; j++) {
                if (tele[j] < tele[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = tele[i];
                tele[i] = tele[minIndex];
                tele[minIndex] = temp;
            }
        }
        return tele;
    }

    public static int findMax(int[] tele1) {
        int max = tele1[0];
        for (int index = 0; index < tele1.length; index++) {
            if(tele1[index] > max) {
                max = tele1[index];
            }
        }
        return max;
    }
}
