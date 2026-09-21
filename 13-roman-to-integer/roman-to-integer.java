class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = getValue(s.charAt(i));

            if (i + 1 < s.length()) {

                int next = getValue(s.charAt(i + 1));

                if (current < next) {
                    sum -= current;
                }
                else {
                    sum += current;
                }

            }
            else {
                sum += current;
            }
        }

        return sum;
    }

    private int getValue(char c) {

        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}