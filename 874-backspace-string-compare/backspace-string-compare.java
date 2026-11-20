class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char ch1 : s.toCharArray()) {
            if (ch1 == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch1);
            }
        }
        for (char ch2 : t.toCharArray()) {
            if (ch2 == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(ch2);
            }
        }
        return st1.equals(st2);
    }
}