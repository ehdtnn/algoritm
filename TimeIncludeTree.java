package test;

import org.w3c.dom.ls.LSOutput;

public class TimeIncludeTree {
    public static void main(String[] args) {
        int count = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                for (int sec=0; sec<60; sec++) {
                    if (check(hour, min, sec)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static boolean check(int hour, int min, int sec) {
        return (hour % 10 == 3 || min / 10 == 3 || min % 10 == 3 || sec /10 == 3 || sec % 10 == 3);
    }

}
