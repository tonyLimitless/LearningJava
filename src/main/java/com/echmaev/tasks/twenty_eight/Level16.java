package com.echmaev.tasks.twenty_eight;

import java.util.Arrays;

class Level1 {
    public static int MaximumDiscount(int N, int[] price) {
        Arrays.sort(price); // Сортируем цены в порядке возрастания
        int discount = 0;

        // Вычисляем количество троек товаров, для которых можно получить бесплатную покупку
        int triplets = N / 3;

        // Вычисляем количество оставшихся товаров, которые не входят в полные тройки
        int remainingItems = N % 3;

        // Вычисляем сумму цен самых дешевых товаров в каждой тройке
        for (int i = 0; i < triplets; i++) {
            discount += price[i * 3];
        }

        // Добавляем цены оставшихся самых дешевых товаров
        for (int i = 0; i < remainingItems; i++) {
            discount += price[N - 1 - i];
        }

        return discount;
    }
}
