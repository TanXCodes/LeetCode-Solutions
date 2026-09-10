import java.util.StringTokenizer;

class Solution {
    public int countSegments(String s) {
        int count = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            st.nextToken(); // Advances to the next token
            count++;
        }
        return count;
    }
}