package com.echmaev.tasks.twenty_eight;

import java.util.HashMap;
import java.util.Map;

public class Level12 {
    public static String MassVote(int n, int [] votes) {
        if (n == 1) {
            return "majority winner 1";
        }
        if (n == 0) {
            return "no winner";
        }
        int sum = findSumInArray(votes);
        int[] arrayIndexMaxValue = findArrayIndexMaxValue(votes);

        if (arrayIndexMaxValue.length == 2) {
            float findPercent = arrayIndexMaxValue[1] * 100 / (float) sum;
            if (findPercent > 50) {
                return "majority winner " + (arrayIndexMaxValue[0] + 1);
            }

            return "minority winner " + (arrayIndexMaxValue[0] + 1);
        } else {
            return "no winner";
        }
    }

    private static int[] findArrayIndexMaxValue(int[] votes) {
        int maxInArray = votes[0];
        int countOfMax = 0;
        Map<Integer, Integer> indexForMaxValueMap = new HashMap<>();
        for(int count = 0; count < votes.length; count++) {
            if (votes[count] >= maxInArray) {
                indexForMaxValueMap.put(votes[count], count);
                maxInArray = votes[count];
            }
        }

        for (int value : votes) {
            if (value == maxInArray) {
                countOfMax++;
            }
        }

        if (countOfMax == 1) {
            return new int[] {indexForMaxValueMap.get(maxInArray), maxInArray};
        }
        return new int[]{};
    }

    private static int findSumInArray(int[] votes) {
        int sum = 0;
        for (int value : votes) {
            sum += value;
        }
        return sum;
    }
}
