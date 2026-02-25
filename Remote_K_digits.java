class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            while (!st.isEmpty() && st.peek() > digit && k > 0) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        String result = sb.reverse().toString();

       
        int index = 0;
        while (index < result.length() && result.charAt(index) == '0') {
            index++;
        }

        result = result.substring(index);

        return result.length() == 0 ? "0" : result;
    }
}
