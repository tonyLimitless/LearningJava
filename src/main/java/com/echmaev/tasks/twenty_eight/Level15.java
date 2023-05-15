package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        if (H2 > H1 || W2 > W1) {
            return false;
        }
        // Преобразование строковых параметров в двумерные массивы
        String[] map1 = S1.split(" ");
        String[] map2 = S2.split(" ");

        // Поиск карты 2 в карте 1
        for (int i = 0; i <= H1 - H2; i++) {
            for (int j = 0; j <= W1 - W2; j++) {
                boolean match = true;

                // Проверка соответствия элементов карты
                for (int k = 0; k < H2; k++) {
                    for (int l = 0; l < W2; l++) {
                        if (map1[i + k].charAt(j + l) != map2[k].charAt(l)) {
                            match = false;
                            break;
                        }
                    }

                    if (!match) {
                        break;
                    }
                }

                // Если найдено совпадение, вторая карта содержится в первой
                if (match) {
                    return true;
                }
            }
        }

        // Вторая карта не найдена в первой
        return false;
    }
}
