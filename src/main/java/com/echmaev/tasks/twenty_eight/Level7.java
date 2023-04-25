package com.echmaev.tasks.twenty_eight;

import java.util.ArrayList;
import java.util.List;

public class Level1 {
    public static int[] WordSearch(int len, String s, String subs) {
        // Шаг 1: разбиваем строку на набор строк через выравнивание по заданной ширине
        List<String> lines = new ArrayList<>();
        int index = 0;
        while (index < s.length()) {
            int endIndex = Math.min(index + len, s.length());
            if (endIndex == s.length()) {
                lines.add(s.substring(index));
                break;
            }
            int lastSpaceIndex = s.lastIndexOf(" ", endIndex);
            if (lastSpaceIndex > index) {
                lines.add(s.substring(index, lastSpaceIndex));
                index = lastSpaceIndex + 1;
            } else {
                lines.add(s.substring(index, endIndex));
                index = endIndex;
            }
        }

        // Шаг 2: проверяем каждую строку на наличие заданного слова
        int[] results = new int[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            String[] wordsInLine = lines.get(i).split(" ");
            boolean found = false;
            for (int j = 0; j < wordsInLine.length; j++) {
                if (wordsInLine[j].equals(subs)) {
                    found = true;
                    break;
                }
            }
            results[i] = found ? 1 : 0;
        }

        return results;
    }

}
