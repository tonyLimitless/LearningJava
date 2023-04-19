package com.echmaev.tasks.twenty_eight;

import java.util.*;

public class Level1 {
    public static int squirrel(int n) {
        if (n > 0) {
            int newValue = n;
            for (int counter = n; counter > 1; counter--) {
                newValue = newValue * (counter - 1);
            }
            String number = String.valueOf(newValue);
            return Integer.valueOf(String.valueOf(number.toCharArray()[0]));
        } else {
            return 1;
        }
    }
}