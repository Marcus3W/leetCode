package Medium;

public class _7_Reverse_Integer {

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            result = result * 10 + pop;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}
