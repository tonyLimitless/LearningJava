package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static int Unmanned(int L, int N, int[][] track) {
        String color = "";
        int dist_gen = 0;
        int gen_count = 0; // общий счетчик ходов

        for (int k = 0; k < track.length; k++) { // отрезков действия столько сколько светофоров
            int time_light = 0; // счетчик горения светофора? обнуляем при переходе к след светофору
            int wait_time = 0; // время ожидания на светофоре
            int time_drive = 0;

            while (true) {
                time_drive += 1;
                gen_count += 1;
                time_light += 1; // сначала загорается красный

                if (time_light > track[k][1] + track[k][2]) { // зацикливаем бесконечное горение светоф
                    time_light = 1;
                }

                if (time_light <= track[k][1]) {
                    color = "red"; // то горит красный
                }

                if (time_light > track[k][1] && time_light <= track[k][1] + track[k][2]) {
                    color = "green";
                }

                if (color.equals("green") && k == 0 && track.length > 1) {
                    dist_gen = track[k][0] + wait_time + (track[k + 1][0] - track[k][0]);
                    break;
                }

                if (gen_count > track[k][0] && color.equals("red") && k == 0) { // k==0 заглушка для работы только на 1 светофоре
                    wait_time += 1; // необходимо сделать чтобы было 2
                }

                if (time_drive > dist_gen && color.equals("red") && k > 0) {
                    wait_time += 1;
                }

                if (time_drive >= dist_gen && color.equals("green") && k < track.length - 1) {
                    dist_gen = dist_gen + wait_time + (track[k + 1][0] - track[k][0]);
                    break;
                }

                if (time_drive >= dist_gen && color.equals("green") && k == track.length - 1 && track.length > 1) {
                    dist_gen = dist_gen + wait_time + (L - track[k][0]);
                    return dist_gen;
                }

                if (color.equals("green") && track.length == 1) {
                    dist_gen = track[k][0] + wait_time + (L - track[k][0]);
                    return dist_gen;
                }
            }
        }

        return dist_gen;
    }
}
