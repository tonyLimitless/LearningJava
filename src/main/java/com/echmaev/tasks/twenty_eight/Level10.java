package com.echmaev.tasks.twenty_eight;

import java.util.HashMap;
import java.util.Map;

public class Level10 {
    public static int PrintingCosts(String line) {
        char[] charArray = line.toCharArray();
        Map<String, Integer> tonerForSymbolMap = initMap();
        int sum = 0;

        for(char symbol: charArray) {
            sum += tonerForSymbolMap.getOrDefault(String.valueOf(symbol), 23);
        }

        return sum;
    }
    public static Map<String, Integer> initMap() {
        Map<String, Integer> tonerForSymbolMap = new HashMap<>();
        tonerForSymbolMap.put(" ", 0);
        tonerForSymbolMap.put("&", 24);
        tonerForSymbolMap.put(",", 7);
        tonerForSymbolMap.put("2", 22);
        tonerForSymbolMap.put("8", 23);
        tonerForSymbolMap.put(">", 10);
        tonerForSymbolMap.put("D", 26);
        tonerForSymbolMap.put("J", 18);
        tonerForSymbolMap.put("P", 23);
        tonerForSymbolMap.put("V", 19);
        tonerForSymbolMap.put("\\", 10);
        tonerForSymbolMap.put("b", 25);
        tonerForSymbolMap.put("h", 21);
        tonerForSymbolMap.put("n", 18);
        tonerForSymbolMap.put("t", 17);
        tonerForSymbolMap.put("z", 19);

        tonerForSymbolMap.put("!", 9);
        tonerForSymbolMap.put("'", 3);
        tonerForSymbolMap.put("-", 7);
        tonerForSymbolMap.put("3", 23);
        tonerForSymbolMap.put("9", 26);
        tonerForSymbolMap.put("?", 15);
        tonerForSymbolMap.put("E", 26);
        tonerForSymbolMap.put("K", 21);
        tonerForSymbolMap.put("Q", 31);
        tonerForSymbolMap.put("W", 26);
        tonerForSymbolMap.put("]", 18);
        tonerForSymbolMap.put("c", 17);
        tonerForSymbolMap.put("i", 15);
        tonerForSymbolMap.put("o", 20);
        tonerForSymbolMap.put("u", 17);
        tonerForSymbolMap.put("{", 18);

        tonerForSymbolMap.put("\"", 6);
        tonerForSymbolMap.put("(", 12);
        tonerForSymbolMap.put(".", 4);
        tonerForSymbolMap.put("4", 21);
        tonerForSymbolMap.put(":", 8);
        tonerForSymbolMap.put("@", 32);
        tonerForSymbolMap.put("F", 20);
        tonerForSymbolMap.put("L", 16);
        tonerForSymbolMap.put("R", 28);
        tonerForSymbolMap.put("X", 18);
        tonerForSymbolMap.put("^", 7);
        tonerForSymbolMap.put("d", 25);
        tonerForSymbolMap.put("j", 20);
        tonerForSymbolMap.put("p", 25);
        tonerForSymbolMap.put("v", 13);
        tonerForSymbolMap.put("|", 12);

        tonerForSymbolMap.put("#", 24);
        tonerForSymbolMap.put(")", 12);
        tonerForSymbolMap.put("/", 10);
        tonerForSymbolMap.put("5", 27);
        tonerForSymbolMap.put(";", 11);
        tonerForSymbolMap.put("A", 24);
        tonerForSymbolMap.put("G", 25);
        tonerForSymbolMap.put("M", 28);
        tonerForSymbolMap.put("S", 25);
        tonerForSymbolMap.put("Y", 14);
        tonerForSymbolMap.put("_", 8);
        tonerForSymbolMap.put("e", 23);
        tonerForSymbolMap.put("k", 21);
        tonerForSymbolMap.put("q", 25);
        tonerForSymbolMap.put("w", 19);
        tonerForSymbolMap.put("}", 18);

        tonerForSymbolMap.put("$", 29);
        tonerForSymbolMap.put("*", 17);
        tonerForSymbolMap.put("0", 22);
        tonerForSymbolMap.put("6", 26);
        tonerForSymbolMap.put("<", 10);
        tonerForSymbolMap.put("B", 29);
        tonerForSymbolMap.put("H", 25);
        tonerForSymbolMap.put("N", 25);
        tonerForSymbolMap.put("T", 16);
        tonerForSymbolMap.put("Z", 22);
        tonerForSymbolMap.put("`", 3);
        tonerForSymbolMap.put("f", 18);
        tonerForSymbolMap.put("l", 16);
        tonerForSymbolMap.put("r", 13);
        tonerForSymbolMap.put("x", 13);
        tonerForSymbolMap.put("~", 9);

        tonerForSymbolMap.put("%", 22);
        tonerForSymbolMap.put("+", 13);
        tonerForSymbolMap.put("1", 19);
        tonerForSymbolMap.put("7", 16);
        tonerForSymbolMap.put("=", 14);
        tonerForSymbolMap.put("C", 20);
        tonerForSymbolMap.put("I", 18);
        tonerForSymbolMap.put("O", 26);
        tonerForSymbolMap.put("U", 23);
        tonerForSymbolMap.put("[", 18);
        tonerForSymbolMap.put("a", 23);
        tonerForSymbolMap.put("g", 30);
        tonerForSymbolMap.put("m", 22);
        tonerForSymbolMap.put("s", 21);
        tonerForSymbolMap.put("y", 24);

        return tonerForSymbolMap;
    }
}
