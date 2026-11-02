package homework.h01;

// https://leetcode.com
public class T3 {
    public int countOdds(int low, int high) {
        if (low % 2 != 0 || high % 2 != 0) {
            return (high - low) / 2 + 1;
        }
        return (high - low) / 2;
    }
}
