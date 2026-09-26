class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //Convert entire paragraph to lowercase for case-insensitive comparison
        String low = paragraph.toLowerCase();
        
        //Split into words using regex that matches non-letter characters
        String[] words = low.split("[^a-z]+");
        
        //Initialize result variable
        String res = "";

        //Create HashMap to store word frequencies
        Map<String, Integer> map = new HashMap<>();
        
        //Process each word from the split array
        for (String word : words) {
            //Skip empty strings that might result from splitting
            if (word.isEmpty()) continue; 
            
            //Check if current word is in banned list
            boolean isBanned = false;
            for (String bannedWord : banned) {
                if (word.equals(bannedWord)) {
                    isBanned = true;
                    break;
                }
            }
            
            //If word is not banned, update its frequency count
            if (!isBanned) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        //Find the word with maximum frequency
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                res = entry.getKey();
            }
        }

        //Return the most frequent non-banned word
        return res;
    }
}