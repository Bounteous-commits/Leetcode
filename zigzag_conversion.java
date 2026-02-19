class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] ans = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) ans[i] = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
           
            for(int index = 0; index < numRows && i < s.length(); index++) {
                ans[index].append(s.charAt(i));
                i++;
            }
            
            for(int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index].append(s.charAt(i));
                i++;
            }
        }

        StringBuilder st = new StringBuilder();
        for(int j = 0; j < numRows; j++) st.append(ans[j]);
        return st.toString();
    }
}
