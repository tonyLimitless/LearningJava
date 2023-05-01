package com.echmaev.tasks.twenty_eight;

public class Level8 {
    public static int SumOfThe(int n, int[] nums) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            int otherSum = sum - nums[i];
            if (nums[i] == otherSum) {
                return nums[i];
            }
        }
        return -1;
    }
}
