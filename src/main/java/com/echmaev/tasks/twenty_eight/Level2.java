package com.echmaev.tasks.twenty_eight;

public class Level1 {
    public static int odometer(int[] oksana) {
//        if (oksana.length % 2 != 0 || oksana.length < 2) {
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        } else {
            int countOfActivities = oksana.length / 2;
            int km;
            if(countOfActivities == 1) {
                km = oksana[0] * oksana[1];
                return km;
            } else {
                km = oksana[0] * oksana[1];
                while (countOfActivities > 1) {
                    km += (oksana[countOfActivities * 2 - 1] - oksana[countOfActivities * 2 - 3])
                            * oksana[countOfActivities * 2 - 2];
                    countOfActivities--;
                }
                System.out.println(km);
            }
            return km;
//        }
    }
}
