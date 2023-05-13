package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static int Unmanned(int L, int N, int[][] track) {
        int time = 0; // текущее время
        int position = 0; // текущая позиция автомобиля

        for (int i = 0; i < N; i++) {
            // вычисляем время, через которое автомобиль достигнет i-го светофора
            int arrivalTime = track[i][0];

            // вычисляем количество циклов светофора, которые пройдет автомобиль до прибытия
            int cycles = (arrivalTime - position) / (track[i][1] + track[i][2]);

            // обновляем текущее время и позицию автомобиля
            time += cycles * (track[i][1] + track[i][2]);
            position += cycles * (track[i][1] + track[i][2]);

            // проверяем, на какой цвет переключится светофор в момент прибытия автомобиля
            if (position < arrivalTime) {
                position = arrivalTime;
            } else if (position >= arrivalTime && position < arrivalTime + track[i][1]) {
                time += track[i][1] - (position - arrivalTime);
                position = arrivalTime + track[i][1];
            }
        }

        // вычисляем оставшееся время до конца дороги
        int remainingTime = L - position;
        time += remainingTime;

        return time;
    }
}
