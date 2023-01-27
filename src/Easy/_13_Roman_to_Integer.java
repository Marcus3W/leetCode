package Easy;

import java.util.HashMap;
import java.util.Map;

public class _13_Roman_to_Integer {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToIntHashMap(s));

    }

    /**
     * Given a roman numeral, convert it to an integer.
     *
     * @param s Roman numeral
     * @return int - the integer value of the roman numeral
     */
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        int curr = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> curr = 1;
                case 'V' -> curr = 5;
                case 'X' -> curr = 10;
                case 'L' -> curr = 50;
                case 'C' -> curr = 100;
                case 'D' -> curr = 500;
                case 'M' -> curr = 1000;
            }
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }

    public static int romanToIntHashMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = map.get(s.charAt(i));
            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > val) {
                result -= val;
            } else {
                result += val;
            }
        }
        return result;
    }

}
