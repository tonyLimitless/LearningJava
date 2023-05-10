package com.echmaev.tasks.twenty_eight;

import java.util.HashMap;
import java.util.Map;

public class Level5 {
    public static int [] SynchronizingTables(int n, int [] ids, int [] salary) {

        int[] arrayIds = new int[n];

        for (int index = 0; index < n; index++) {
            arrayIds[index] = ids[index];
        }

        Map<Integer, Integer> salaryForIdsMap = new HashMap<>(n);

        sortOfChoice(ids);
        sortOfChoice(salary);

        for (int index = 0; index < n; index++) {
            salaryForIdsMap.put(ids[index], salary[index]);
        }

        int[] newArray = new int[n];

        for (int index = 0; index < n; index++) {
            newArray[index] = salaryForIdsMap.get(arrayIds[index]);
        }

        return newArray;

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
}
