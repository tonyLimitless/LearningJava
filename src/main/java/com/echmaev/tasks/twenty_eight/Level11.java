package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static String BigMinus(String s1, String s2) {

        // Проверка, что первое число больше или равно второму
        if (s1.compareTo(s2) < 0) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        // Дополнение второго числа нулями слева до длины первого числа
        while (s2.length() < s1.length()) {
            s2 = "0" + s2;
        }

        StringBuilder result = new StringBuilder();
        int borrow = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            int digit1 = s1.charAt(i) - '0';
            int digit2 = s2.charAt(i) - '0';
            int diff = digit1 - digit2 - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.insert(0, diff);
        }

        // Удаление ведущих нулей из результата
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
