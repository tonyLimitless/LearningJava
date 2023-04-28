package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static int SumOfThe(int n, int[] data) {
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += data[i];
            if (data[i] > maxNum) {
                maxNum = data[i];
            }
        }
        if (maxNum > sum - maxNum) {
            return -1; // Невозможно найти число, которое является суммой всех остальных чисел.
        }
        return sum - maxNum;
    }
}
