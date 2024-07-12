class Solution {
    public int maximumGain(String s, int x, int y) {
     
        // If y > x, we first remove "ba" pairs, otherwise we first remove "ab" pairs.
        if (y > x) {
            return calculateMaxGain(s, 'b', 'a', y, x);
        } else {
            return calculateMaxGain(s, 'a', 'b', x, y);
        }
    }

    private int calculateMaxGain(String s, char first, char second, int firstValue, int secondValue) {
        Stack<Character> stack = new Stack<>();
        int sum = 0;

        // First pass to remove pairs of (first, second)
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                sum += firstValue;
            } else {
                stack.push(c);
            }
        }

        // Collect remaining characters into a new string
        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.append(stack.pop());
        }
        remaining.reverse();

        // Second pass to remove pairs of (second, first)
        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second && c == first) {
                stack.pop();
                sum += secondValue;
            } else {
                stack.push(c);
            }
        }

        return sum;
    }

}