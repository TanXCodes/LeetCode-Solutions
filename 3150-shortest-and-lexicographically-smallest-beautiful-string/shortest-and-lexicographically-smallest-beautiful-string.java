class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int n = s.length();

        for(int i=0; i<n; i++){
            int oneCount = 0;
            StringBuilder cur = new StringBuilder();

            for(int j=i; j<n; j++){
                cur.append(s.charAt(j));

                if(s.charAt(j) == '1')
                    oneCount++;

                if(oneCount > k)
                    break;

                if(oneCount == k){
                    String curStr = cur.toString();
                
                if(ans.isEmpty() || curStr.length() < ans.length() || (curStr.length() == ans.length() && curStr.compareTo(ans)<0))
                    ans = curStr;
                }
            }
        }
        return ans;
    }

}