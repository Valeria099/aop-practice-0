package homework.h02;

import java.util.Arrays;

// https://leetcode.com
public class T2 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return sum / (salary.length - 2);
    }
}
