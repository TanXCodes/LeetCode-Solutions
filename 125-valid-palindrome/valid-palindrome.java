class Solution{
    public boolean isPalindrome(String s){
        String str = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str += Character.toLowerCase(ch);
            }
        }

        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }
}




// class Solution{
//     public boolean isPalindrome(String s){
//         String str = "";
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(Character.isLetterOrDigit(ch)){
//                 str += Character.toLowerCase(ch);
//             }
//         }
//         String rev = "";
//         for(int i=str.length() - 1 ; i >= 0; i--){
//             rev += str.charAt(i);
//         }
//         return rev.equals(str);
//     }
// }






// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;        
//     }
// }