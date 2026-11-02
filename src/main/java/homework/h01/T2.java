package homework.h01;

// https://leetcode.com/problems/smallest-even-multiple/submissions/2187869796
public class T2 {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }
}
