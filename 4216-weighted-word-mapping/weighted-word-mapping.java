class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        int sum;
        for(int i = 0; i<words.length; i++){
            sum = 0;
           for(int j=0; j<words[i].length(); j++){
            int temp = words[i].charAt(j) - 'a';
            sum += weights[temp];
           }
           sum %= 26;
           char temp = (char)('z' - sum);
           sb.append(temp);
        }
        return sb.toString();
    }
}