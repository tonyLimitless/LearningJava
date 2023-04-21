package com.echmaev.tasks.twenty_eight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Level1 {
    public static int ConquestCampaign(int x, int y, int l, int [] battalion) {
        Set<Point> pointSet = buildHashSet(battalion);
        int allBoxes = x * y;
        List<Point> paintedCellsBeforeToday = new ArrayList<>();
        paintedCellsBeforeToday.addAll(pointSet);
        List<Point> paintedCellsToday = new ArrayList<>();
        int whatDayToday = 1;
        while (allBoxes != paintedCellsBeforeToday.size()) {
            for (int counter = 0; counter < paintedCellsBeforeToday.size(); counter++) {

                // check up
                if(paintedCellsBeforeToday.get(counter).getX() - 1 > 0) {
                    Point pointUp = new Point(paintedCellsBeforeToday.get(counter).getX() - 1,
                            paintedCellsBeforeToday.get(counter).getY());
                    if (!pointIsInTwoLists(pointUp, paintedCellsBeforeToday, paintedCellsToday)) {
                        paintedCellsToday.add(pointUp);
                    }
                }
                // check left
                if(paintedCellsBeforeToday.get(counter).getY() - 1 > 0) {
                    Point pointLeft = new Point(paintedCellsBeforeToday.get(counter).getX(),
                            paintedCellsBeforeToday.get(counter).getY() - 1);
                    if (!pointIsInTwoLists(pointLeft, paintedCellsBeforeToday, paintedCellsToday)) {
                        paintedCellsToday.add(pointLeft);
                    }
                }

                // check down
                if(paintedCellsBeforeToday.get(counter).getX() + 1 < x + 1) {
                    Point pointDown = new Point(paintedCellsBeforeToday.get(counter).getX() + 1,
                            paintedCellsBeforeToday.get(counter).getY());
                    if (!pointIsInTwoLists(pointDown, paintedCellsBeforeToday, paintedCellsToday)) {
                        paintedCellsToday.add(pointDown);
                    }
                }

                // check right
                if(paintedCellsBeforeToday.get(counter).getY() + 1 < y + 1) {
                    Point pointRight = new Point(paintedCellsBeforeToday.get(counter).getX(),
                            paintedCellsBeforeToday.get(counter).getY() + 1);
                    if (!pointIsInTwoLists(pointRight, paintedCellsBeforeToday, paintedCellsToday)) {
                        paintedCellsToday.add(pointRight);
                    }
                }
            }
            paintedCellsBeforeToday.addAll(paintedCellsToday);
            paintedCellsToday.clear();
            whatDayToday++;
        }
        return whatDayToday;
    }

    public static boolean pointIsInTwoLists(
            Point point,
            List<Point> paintedCellsBeforeToday,
            List<Point> paintedCellsToday) {

        if(paintedCellsBeforeToday.contains(point) || paintedCellsToday.contains(point)) {
            return true;
        }
        return false;
    }

    public static Set<Point> buildHashSet(int[] battalion) {
        Set<Point> pointSet = new HashSet<>(battalion.length);
        for (int i = 0; i < battalion.length - 1; i += 2) {
            Point point = new Point(battalion[i], battalion[i + 1]);
            pointSet.add(point);
        }
        return pointSet;
    }
    static class Point {
        int x;
        int y;

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (x != point.x) return false;
            return y == point.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}