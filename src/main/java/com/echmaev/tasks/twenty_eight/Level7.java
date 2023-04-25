package com.echmaev.tasks.twenty_eight;

import java.util.ArrayList;
import java.util.List;

public class Level1 {
    public static int[] WordSearch(int len, String s, String subs) {
        // Шаг 1: разбиваем строку на набор строк через выравнивание по заданной ширине
        List<String> lines = new ArrayList<>();
        String[] words = s.split(" ");
        String line = "";
        for (int i = 0; i < words.length; i++) {
            if (line.isEmpty()) {
                line = words[i];
            } else if (line.length() + words[i].length() + 1 <= len) {
                line += " " + words[i];
            } else {
                lines.add(line);
                line = words[i];
            }
        }
        if (!line.isEmpty()) {
            lines.add(line);
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
